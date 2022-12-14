package com.example.demo.modelo;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="personas")

public class Persona {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;
  private String nombres;
  private String apellidos;
  private String correo;
  private String contrasena;

public Persona() {
	
}

public Persona(int id, String nombres, String apellidos, String correo, String contrasena) {
	super();
	this.id = id;
	this.nombres = nombres;
	this.apellidos = apellidos;
	this.correo = correo;
	this.contrasena = contrasena;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNombres() {
	return nombres;
}

public void setNombres(String nombres) {
	this.nombres = nombres;
}

public String getApellidos() {
	return apellidos;
}

public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}

public String getContrasena() {
	return contrasena;
}

public void setContrasena(String contrasena) {
	this.contrasena = contrasena;
}

}

