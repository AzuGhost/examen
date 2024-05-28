package com.example.luis.hotel_luis;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class luisHotelService {

    @Autowired
    private luisHotelRepository repository;

    public List<luisHotel> getAllHoteles() {
        return repository.findAll();
    }

    public Optional<luisHotel> getHotelById(Long id) {
        return repository.findById(id);
    }

    public luisHotel saveHotel(luisHotel hotel) {
        return repository.save(hotel);
    }

    public void deleteHotel(Long id) {
        repository.deleteById(id);
    }
}
