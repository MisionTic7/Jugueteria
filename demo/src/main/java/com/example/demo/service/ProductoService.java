package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.demo.inteface.IProducto;
import com.example.demo.interfaceService.IproductoService;
import com.example.demo.modelo.Producto;

public class ProductoService implements IproductoService{
    @Autowired
	private IProducto data;
	@Override
	public List<Producto> listar2() {
		// TODO Auto-generated method stub
		return (List<Producto>)data.findAll();
	}

	@Override
	public Optional<Producto> listarId(int product_id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Producto p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int product_id) {
		// TODO Auto-generated method stub
		
	}

}
