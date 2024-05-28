package com.example.luis.luis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface luisReservacionRepository extends JpaRepository<luisReservacionEntity, Long> {
}
