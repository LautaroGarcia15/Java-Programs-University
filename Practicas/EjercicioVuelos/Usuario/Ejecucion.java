package Usuario;
import Negocio.*;
public class Ejecucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vuelo v = new Cabotaje(1, "Paris", 50, 40, "Cabotaje 1");
		Vuelo v2 = new Internacional(2, "Florida", 60, 50, 3);
		
		Compania c = new Compania();
		
		c.agregarVuelo(v);
		c.agregarVuelo(v2);
		
		System.out.println("La cantidad de asientos disponibles para el vuelo nro " + v2.getNroVuelo() + " es: " + c.cantidadAsientosDisp(2));
	}

}
