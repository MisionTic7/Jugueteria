package com.example.demo.inteface;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.modelo.Producto;


public interface IProducto extends CrudRepository<Producto, Integer>{

}
