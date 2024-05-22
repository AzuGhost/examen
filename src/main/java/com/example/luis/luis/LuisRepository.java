package com.example.luis.luis;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestParam;




public interface LuisRepository extends CrudRepository<luisReservacionEntity, Long>{
    @Modifying
    @Query("DELETE FROM reserva r WHERE r.nombre_cliente= :nombre_cliente")
    static
    void deletereluisReservacionEntityByName(@RequestParam("nombre_cliente") String nombre_cliente) {
    }     
} 

    
