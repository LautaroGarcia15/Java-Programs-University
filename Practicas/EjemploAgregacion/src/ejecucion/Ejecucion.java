package ejecucion;
import negocio.*;

public class Ejecucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Asiento a = new Asiento(60);
		Asiento a;
		Asiento a2 = new Asiento(60);
		Moto m1 = new Moto(70, 600);
		Moto m2 = new Moto(60, a2);
		
		
		m1 = null;
		//a = m1.getAsiento();
		
		m2 = null;
		
		
		//System.out.println("El tamaño del asiento de m1 es: " + a.getTamanio());
		System.out.println("El tamaño del asiento de m2 es: " + a2.getTamanio());
		
	}

}
