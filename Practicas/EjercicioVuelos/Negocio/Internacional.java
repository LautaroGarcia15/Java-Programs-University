package Negocio;

public class Internacional extends Vuelo{
	private int escalas;
	
	public Internacional(int nroVuelo, String destino, int capacidad, int asientosOcupados, int escalas) {
		super(nroVuelo, destino, capacidad, asientosOcupados);
		this.escalas = escalas;
	}
	
	public int getEscalas() {
		return escalas;
	}
	
	public void setEscalas(int escalas) {
		this.escalas = escalas;
	}
}
