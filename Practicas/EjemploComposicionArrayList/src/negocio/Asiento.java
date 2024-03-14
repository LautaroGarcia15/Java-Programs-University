package negocio;

public class Asiento {
	private int numeroAsiento;
	private int peso;
	
	public void setNumero(int numero) {
		numeroAsiento = numero;
	}
	
	public int getNumeroAsiento() {
		return numeroAsiento;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
}
