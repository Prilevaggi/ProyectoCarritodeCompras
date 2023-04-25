package paquetePOO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Carrito_compras {

	public static void main(String[] args)throws FileNotFoundException  {
	//leer productos desde un archivo
		Producto prod[]=new Producto[3];
		lecturaTxt(prod);
		
	System.out.println("lista de productos:");	
	System.out.println("codigo\tnombre\tprecio\n");	
	for(int i=0;i<prod.length;i++) {
		prod[i].mostrar();
	}
	//cargo personas------------------------------------------------//
	Persona pers1 = new Persona ( "Priscila","Levaggi",  37373593,"2262414455");
	Persona pers2 = new Persona ( "Luciana","Levaggi", 40569236,"2234567891");
	Persona pers3 = new Persona ( "Ezequiel","Ciprian",32700516,"2262414455");
	//cargo clientes------------------------------------------------//
	Cliente cliente1=new Cliente(pers1.getNombre(),pers1.getApellido(),pers1.getDni(),pers1.getTelefono(),526,"prilevaggi@gmail.com");
	Cliente cliente2=new Cliente(pers2.getNombre(),pers2.getApellido(),pers2.getDni(),pers2.getTelefono(),527,"lulevaggi@gmail.com");
	Cliente cliente3=new Cliente(pers3.getNombre(),pers3.getApellido(),pers3.getDni(),pers3.getTelefono(),528,"ezequielCiprain@gmail.com");
	
	//cargoitems--------------------//
    
	ItemCarrito items[]= new ItemCarrito[3];
	items[0] = new ItemCarrito(prod[0], 4);
	items[1] = new ItemCarrito(prod[1], 2);
	items[2] = new ItemCarrito(prod[2], 6);
	
	//asignocarrito-------------------------///

	Carrito chango = new Carrito(15,cliente1,items);
	System.out.println("-----------------------------------------------------------\n");
  double monto=chango.mostrarCarrito();
	
 



	}
	public static void lecturaTxt(Producto v[])throws FileNotFoundException {
		
		FileReader archivo;
		try {
				archivo= new FileReader("C:\\Users\\prile\\eclipse-workspace\\ProyectoCarritoTP5\\lista_Productos.txt");
		}catch(FileNotFoundException err){
			JOptionPane.showMessageDialog(null, "archivo no encontrado"+err.getMessage());
			return;
		}
		BufferedReader buffer=new BufferedReader(archivo);
				
				int j=0;
				while(j<v.length) {
					
					String linea;
					try {
						linea = buffer.readLine();
					} catch (IOException err) {
						JOptionPane.showMessageDialog(null,err.getMessage());
						return;
					}
					String r=linea;
					String []veclineas=r.split(" ");
					
					
						
						int cod=Integer.parseInt(veclineas[0]);
						String nombre=veclineas[1];
						double precio=Double.parseDouble(veclineas[2]);
						
						
						v[j]=new Producto();
						v[j].setCodigo(cod);
						v[j].setNombre(nombre);
						v[j].setPrecio(precio);
						
						j++;
					}
					
					
			}

			
			
	
			
	}
	
