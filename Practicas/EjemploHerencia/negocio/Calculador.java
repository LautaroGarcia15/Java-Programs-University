package negocio;
import java.util.ArrayList;

public class Calculador {
	ArrayList<Pago> listaPagos;
	
	public Calculador() {
		listaPagos = new ArrayList<Pago>();
	}
	
	public double calcularTotal() {
		double total = 0.0;
		for(int i = 0; i < listaPagos.size(); i++) {
			Pago p = listaPagos.get(i);
			total = total + p.calcularMonto();
		}
		
		return total;
	}
	
	public void agregarPago(Pago p) {
		listaPagos.add(p);
	}
}
