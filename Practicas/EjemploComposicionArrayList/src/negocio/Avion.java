package negocio;
import java.util.ArrayList;

public class Avion {
	ArrayList <Asiento> listaAsientos;
	
	public Avion() {
		listaAsientos = new ArrayList<Asiento>();
	}
	
	public void agregarAsiento(Asiento a) {
		listaAsientos.add(a);
	}
	
	public int calcularCantidadAsientos() {
		return listaAsientos.size();
	}
	
	public int calcularPesoTotalPasajeros() {
		int acumulador = 0;
		for(int i = 0; i < listaAsientos.size(); i++) {
			//Asiento a = listaAsientos.get(i);
			//acumulador = acumulador + a.getPeso();
			acumulador += listaAsientos.get(i).getPeso();
	
		}
		
		return acumulador;
	}
	
	public void eliminarAsiento(int numero) {
		for(int i = 0; i<listaAsientos.size(); i++) {
			if(listaAsientos.get(i).getNumeroAsiento() == numero) {
				listaAsientos.remove(i);
			}
		}
	}
}
