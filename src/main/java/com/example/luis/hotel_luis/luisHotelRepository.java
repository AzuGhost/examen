package com.example.luis.hotel_luis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface luisHotelRepository extends JpaRepository<luisHotel, Long> {
}
