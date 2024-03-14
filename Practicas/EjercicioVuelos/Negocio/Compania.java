package Negocio;
import java.util.ArrayList;

public class Compania {
	ArrayList<Vuelo>vuelos;
	
	public Compania() {
		this.vuelos = new ArrayList<Vuelo>();
	}
	
	public void agregarVuelo(Vuelo v) {
		this.vuelos.add(v);
	}
	
	public int cantidadAsientosDisp(int nroVuelo) {
		for(Vuelo v: vuelos) {
			if(nroVuelo == v.getNroVuelo())
				return v.contarAsientosDisp();			
		}
		return 0;
	}
}
