package com.example.luis.hotel_luis;

import java.util.List;

import com.example.luis.luis.luisReservacionEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Hotel")
public class luisHotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String direccion;
    private int estrellas;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<luisReservacionEntity> reservaciones;
}
