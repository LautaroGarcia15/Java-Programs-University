package usuario;
import negocio.*;


public class Ejecucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avion objAvion = new Avion();
		Asiento a1 = new Asiento();
		Asiento a2 = new Asiento();
		
		a1.setNumero(1);
		a1.setPeso(70);
		a2.setNumero(2);
		a2.setPeso(80);
		
		objAvion.agregarAsiento(a1);
		objAvion.agregarAsiento(a2);
		
		objAvion.eliminarAsiento(1);
		
		System.out.println("La cantidad de asientos del avion es: " + objAvion.calcularCantidadAsientos());
		System.out.println("El peso total en pasajeros que carga el avion es de: " + objAvion.calcularPesoTotalPasajeros());
		
		
		
	}

}
