package negocio;

public class Camion {
	class Acoplado{
		int toneladas;
		int ruedas;
	}
	
	private int cantRuedas;
	private double cilindrada;
	private Acoplado acoplado;
	private int pesoCarga;
	
	public Camion(int cantRuedas, double cilindrada, int pesoCarga, int pesoAcoplado) {
		this.cantRuedas = cantRuedas;
		this.cilindrada = cilindrada;
		this.pesoCarga = pesoCarga;
		
		this.acoplado = new Acoplado();
		this.acoplado.toneladas = pesoAcoplado;
	}
	
	public int getCantRuedas() {
		return this.cantRuedas;
	}
	
	public double getCilindrada() {
		return this.cilindrada;
	}
	
	public int getPesoCarga() {
		return this.pesoCarga;
	}
	
	public int calcularPesoTotal() {
		return getPesoCarga() + this.acoplado.toneladas;
	}
}
