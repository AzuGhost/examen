package com.example.luis.hotel_luis;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hoteles")
public class luisHotelController {

    @Autowired
    private luisHotelService service;

    @GetMapping
    public List<luisHotel> getAllHoteles() {
        return service.getAllHoteles();
    }

    @GetMapping("/{id}")
    public ResponseEntity<luisHotel> getHotelById(@PathVariable Long id) {
        Optional<luisHotel> hotel = service.getHotelById(id);
        if (hotel.isPresent()) {
            return ResponseEntity.ok(hotel.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public luisHotel createHotel(@RequestBody luisHotel hotel) {
        return service.saveHotel(hotel);
    }

    @PutMapping("/{id}")
    public ResponseEntity<luisHotel> updateHotel(@PathVariable Long id, @RequestBody luisHotel hotelDetails) {
        Optional<luisHotel> optionalHotel = service.getHotelById(id);
        if (optionalHotel.isPresent()) {
            luisHotel hotel = optionalHotel.get();
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
        Optional<luisHotel> hotel = service.getHotelById(id);
        if (hotel.isPresent()) {
            service.deleteHotel(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
