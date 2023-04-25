package paquetePOO;

public class ItemCarrito  {
	private Producto codigo;
	private int cantidad;
	protected static double precioTotal;
	
	public ItemCarrito(Producto codigo,int cantidad) {
		this.codigo=codigo;
		this.cantidad=cantidad;
		precioTotal=codigo.precio*cantidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioTotal() {
		precioTotal=codigo.precio*cantidad;
		return precioTotal;
	}
	public void mostrarItem() {
		System.out.println(cantidad+" "+codigo.nombre+" "+precioTotal+" ");
	}

	public Producto getCodigo() {
		return codigo;
	}

	public void setCodigo(Producto codigo) {
		this.codigo = codigo;
	}

	
	

}
