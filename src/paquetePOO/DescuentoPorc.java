package paquetePOO;

public class DescuentoPorc extends Descuento {
	
	public float valorFinal(float valorInicial) {
	return valorInicial - (valorInicial *this.getValorDesc());
	
	}
}