package negocio;

public class Moto {
	private Asiento asiento;
	private double cilindrada;
	
	public Moto(int tamanioAsiento, double cilindrada) {
		this.asiento = new Asiento(tamanioAsiento);
		this.cilindrada = cilindrada;
		 
	}
	
	public Moto(int tamanioAsiento, Asiento asiento) {
		this.asiento = asiento;
		this.cilindrada = cilindrada;
	}
	
	public double getTamanioAsiento() {
		return this.asiento.getTamanio();
	}
	
	public Asiento getAsiento() {
		return this.asiento;
	}
}
