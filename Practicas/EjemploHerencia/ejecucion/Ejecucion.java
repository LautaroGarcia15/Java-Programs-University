package ejecucion;
import negocio.*;

public class Ejecucion {
	
	public static void main(String []args) {
		Pago objPago = new Efectivo();
		Pago objPagoDebito = new Debito();
		Calculador objCalculador = new Calculador();
		double total = 0.0;
		
		objPago.setMonto(100);
		objPagoDebito.setMonto(100);
		
		imprimirPago(objPago, "Efectivo");
		imprimirPago(objPagoDebito, "Débito");
		
		objCalculador.agregarPago(objPagoDebito);
		objCalculador.agregarPago(objPago);
		
		total = objCalculador.calcularTotal();
		
		System.out.println("El total de los pagos es: " + total);
		/*
		Double total = objPago.calcularMonto();
		
		System.out.println("El total para pago en efectivo es: " + total);
		
		objPagoDebito.setMonto(100);
		
		total = objPagoDebito.calcularMonto();
		
		System.out.println("El total para pago con débito es: " + total);*/
		
		
	}
	
	public static void imprimirPago(Pago p, String tipo) {
		System.out.println("El total para el pago con " + tipo + " es: " + p.calcularMonto());
		
	}
}
