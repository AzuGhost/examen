package com.example.luis.hotel_luis;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hoteles")
public class HotelController {

    @Autowired
    private HotelService service;

    @GetMapping
    public List<Hotel> getAllHoteles() {
        return service.getAllHoteles();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable Long id) {
        Optional<Hotel> hotel = service.getHotelById(id);
        if (hotel.isPresent()) {
            return ResponseEntity.ok(hotel.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Hotel createHotel(@RequestBody Hotel hotel) {
        return service.saveHotel(hotel);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Hotel> updateHotel(@PathVariable Long id, @RequestBody Hotel hotelDetails) {
        Optional<Hotel> optionalHotel = service.getHotelById(id);
        if (optionalHotel.isPresent()) {
            Hotel hotel = optionalHotel.get();
            hotel.setNombre(hotelDetails.getNombre());
            hotel.setDireccion(hotelDetails.getDireccion());
            hotel.setEstrellas(hotelDetails.getEstrellas());
            return ResponseEntity.ok(service.saveHotel(hotel));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHotel(@PathVariable Long id) {
        Optional<Hotel> hotel = service.getHotelById(id);
        if (hotel.isPresent()) {
            service.deleteHotel(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
