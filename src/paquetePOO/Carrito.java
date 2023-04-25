package paquetePOO;

public class Carrito {
	private int num;
	private Cliente usuario;
	private ItemCarrito productos[]=new ItemCarrito[10];
	private double totalCompra;
	
	public Carrito(int num,Cliente usuario, ItemCarrito prod[]) {
		
		this.num=num;
		for(int i=0;i<prod.length;i++) {
			productos[i] = prod[i];
			
			}
		
		this.usuario = usuario;
	
		
	}
	
	
    public double getTotalCompra() {
		return totalCompra;
	}
	
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public double mostrarCarrito() {
		System.out.println("Carrito de compras nro"+getNum());	
		double suma=0;
		
		for(int i=0;i<productos.length;i++) {
			
			System.out.println(productos[i].getCantidad()+" "+productos[i].getCodigo().nombre+" ---- SUBTOTAL:"+productos[i].getPrecioTotal());
			suma+=productos[i].getPrecioTotal();
			}
		
		
		System.out.println("\n\nTOTAL DE LA COMPRA:"+suma);	
		return suma;
	
	}
	


	
	

	

}
