package com.example.luis.luis;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;





public interface LuisRepository extends CrudRepository<luisReservacionEntity, Long>{
    @Modifying
@Query("DELETE FROM luisReservacionEntity r WHERE r.nombre_cliente = :nombre_cliente")
int deletereluisReservacionEntityByName(@Param("nombre_cliente") String nombre_cliente);
}

    
