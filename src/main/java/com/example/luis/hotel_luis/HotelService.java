package com.example.luis.hotel_luis;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {

    @Autowired
    private HotelRepository repository;

    public List<Hotel> getAllHoteles() {
        return repository.findAll();
    }

    public Optional<Hotel> getHotelById(Long id) {
        return repository.findById(id);
    }

    public Hotel saveHotel(Hotel hotel) {
        return repository.save(hotel);
    }

    public void deleteHotel(Long id) {
        repository.deleteById(id);
    }
}
