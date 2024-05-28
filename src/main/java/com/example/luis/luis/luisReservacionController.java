package com.example.luis.luis;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reservaciones")
public class luisReservacionController {

    @Autowired
    private luisReservacionService service;

    @GetMapping("/ver")
    public List<luisReservacionEntity> getAllReservaciones() {
        return service.getAllReservaciones();
    }

    @GetMapping("/{id}")
    public ResponseEntity<luisReservacionEntity> getReservacionById(@PathVariable Long id) {
        Optional<luisReservacionEntity> reservacion = service.getReservacionById(id);
        if (reservacion.isPresent()) {
            return ResponseEntity.ok(reservacion.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping ("/")
    public luisReservacionEntity createReservacion(@RequestBody luisReservacionEntity reservacion) {
        return service.saveReservacion(reservacion);
    }

    @PutMapping("/{id}")
    public ResponseEntity<luisReservacionEntity> updateReservacion(@PathVariable Long id, @RequestBody luisReservacionEntity reservacionDetails) {
        Optional<luisReservacionEntity> optionalReservacion = service.getReservacionById(id);
        if (optionalReservacion.isPresent()) {
            luisReservacionEntity reservacion = optionalReservacion.get();
            reservacion.setNumero_habitacion(reservacionDetails.getNumero_habitacion());
            reservacion.setFecha_ingreso(reservacionDetails.getFecha_ingreso());
            reservacion.setDisponible(reservacionDetails.isDisponible());
            reservacion.setNombre_cliente(reservacionDetails.getNombre_cliente());
            reservacion.setHotel(reservacionDetails.getHotel());
            return ResponseEntity.ok(service.saveReservacion(reservacion));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReservacion(@PathVariable Long id) {
        Optional<luisReservacionEntity> reservacion = service.getReservacionById(id);
        if (reservacion.isPresent()) {
            service.deleteReservacion(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
