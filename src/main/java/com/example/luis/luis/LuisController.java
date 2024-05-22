package com.example.luis.luis;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/citas")
public class LuisController 

{
    @Autowired
    private LuisService luisService;

    
    @PostMapping("/")

    public luisReservacionEntity save(@RequestBody luisReservacionEntity entity) {
       return luisService.save(entity);
    }

    @GetMapping("/citas")
    @Operation(summary = "LLamar a todos los citas")

    public List<luisReservacionEntity> findAll() {
        return luisService.findAll();
    }

    @DeleteMapping("/{nombre_cliente}")
    @Operation(summary = "Eliminar las citas por el nombre")
    public luisReservacionEntity deleteluisReservacionEntityByName(@PathVariable("nombre_cliente") String nombre_cliente){
        return LuisService.deleteluisReservacionEntityByName(nombre_cliente);
    }



   
 }
