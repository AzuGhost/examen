package com.example.luis.luis;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class LuisService
{
    @Autowired
    private LuisRepository luisRepository;

    public luisReservacionEntity save(luisReservacionEntity entity){
      return luisRepository.save(entity);
  }
  public List<luisReservacionEntity> findAll(){
      return (List<luisReservacionEntity>) luisRepository.findAll();       
  }
  @Transactional
public void deleteluisReservacionEntityByName(String nombre_cliente) {
    luisRepository.deletereluisReservacionEntityByName(nombre_cliente);
}
}
