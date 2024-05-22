package com.example.luis.luis;
import java.sql.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Reserva")
public class luisReservacionEntity {

    @Id
    @GeneratedValue (strategy  =  GenerationType.IDENTITY)
    private long id;
    private int numero_habitacion;
    private Date fecha_ingreso;
    private boolean disponible;
    private String nombre_cliente;
    
}