package com.example.demo.modelo;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="products")
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int product_id;
private String titulo;
private String descripcion;
private float precio; 

public Producto() {
	
  }

public Producto(int product_id, String titulo, String descripcion, float precio) {
	super();
	this.product_id = product_id;
	this.titulo = titulo;
	this.descripcion = descripcion;
	this.precio = precio;
}

public int getProduct_id() {
	return product_id;
}

public void setProduct_id(int product_id) {
	this.product_id = product_id;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public float getPrecio() {
	return precio;
}

public void setPrecio(float precio) {
	this.precio = precio;
}

}
	
