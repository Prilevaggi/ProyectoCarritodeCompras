package paquetePOO;

public class Cliente extends Persona{
	private int numCliente;
	private String e_mail;
	
	public Cliente(String nombre, String apellido, int dni, String telefono, int numCliente, String e_mail) {
		super(nombre, apellido, dni, telefono);
		this.numCliente = numCliente;
		this.e_mail = e_mail;
	}

	public int getNumCliente() {
		return numCliente;
	}

	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}
}
	
	
	
