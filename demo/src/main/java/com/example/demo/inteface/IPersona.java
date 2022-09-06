package com.example.demo.inteface;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona,Integer>{

}
