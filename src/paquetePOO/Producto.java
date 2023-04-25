package paquetePOO;

import java.io.File;
import java.io.*;
import java.util.Scanner;

public class Producto {
private	int codigo;
protected String nombre;
protected	double precio;



public Producto() {
	this.codigo=codigo;
	this.nombre=nombre;
	this.precio=precio;
}

public void mostrar() {
	System.out.println(codigo+"\t"+nombre+"\t"+precio);
	
}



public int getCodigo() {
	return codigo;
}



public void setCodigo(int codigo) {
	this.codigo = codigo;
}



public String getNombre() {
	return nombre;
}



public void setNombre(String nombre) {
	this.nombre = nombre;
}



public double getPrecio() {
	return precio;
}



public void setPrecio(double precio) {
	this.precio = precio;
}


}
