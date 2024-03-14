package negocio;

public class Efectivo extends Pago{
	private int descuento = 10;
	
	public double calcularMonto() {
		double total;
		
		total = this.monto - (this.monto*descuento/100);
		
		return total;
	}
	
}
