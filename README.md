# examen
5to semestre

imagen swagger 
![alt text](image.png)

link swagger http://localhost:9017/swagger-ui/index.html


reservaciones

GET consulta todas las reservaciones
http://localhost:9017/api/reservaciones/ver

GET consulta por ID
http://localhost:9017/api/reservaciones/4

POST agregar una reservacion
http://localhost:9017/api/reservaciones/

{
    "numero_habitacion": 101,
    "fecha_ingreso": "2024-06-01",
    "disponible": true,
    "nombre_cliente": "Juan Pérez",
    "hotel": {
        "id": 5
    }
}

PUT actualizar una reservacion
http://localhost:9017/api/reservaciones/10
{
    "numero_habitacion": 101,
    "fecha_ingreso": "2024-06-01",
    "disponible": true,
    "nombre_cliente": "Juan Pérez",
    "hotel": {
        "id": 5
    }
}

DELETE http://localhost:9017/api/reservaciones/10


hoteles

GET cosulta todos los hoteles
http://localhost:9017/api/hoteles

GET consulta hoteles por ID
http://localhost:9017/api/hoteles/2

POST para hoteles
http://localhost:9017/api/hoteles

{
  "nombre": "Hotel Quito",
  "direccion": "Av. Amazonas y Patria",
  "estrellas": 4
}

PUT actualizar hoteles
http://localhost:9017/api/hoteles/2

{
  "nombre": "prueba",
  "direccion": "Av. Amazonas y Patria",
  "estrellas": 4
}

DELETE para eliminar hoteles
http://localhost:9017/api/hoteles/2