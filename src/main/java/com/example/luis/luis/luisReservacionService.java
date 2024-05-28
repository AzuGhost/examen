package com.example.luis.luis;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class luisReservacionService {

    @Autowired
    private luisReservacionRepository repository;

    public List<luisReservacionEntity> getAllReservaciones() {
        return repository.findAll();
    }

    public Optional<luisReservacionEntity> getReservacionById(Long id) {
        return repository.findById(id);
    }

    public luisReservacionEntity saveReservacion(luisReservacionEntity reservacion) {
        return repository.save(reservacion);
    }

    public void deleteReservacion(Long id) {
        repository.deleteById(id);
    }
}
