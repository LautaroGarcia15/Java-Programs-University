package Negocio;

public class Vuelo {
	private int nroVuelo;
	private String destino;
	private int capacidad;
	private int asientosOcupados;
	
	public Vuelo(int nroVuelo, String destino, int capacidad, int asientosOcupados) {
		this.nroVuelo = nroVuelo;
		this.destino = destino;
		this.capacidad = capacidad;
		this.asientosOcupados = asientosOcupados;
	}
	
	
	
	public int getNroVuelo() {
		return nroVuelo;
	}



	public void setNroVuelo(int nroVuelo) {
		this.nroVuelo = nroVuelo;
	}



	public String getDestino() {
		return destino;
	}



	public void setDestino(String destino) {
		this.destino = destino;
	}



	public int getCapacidad() {
		return capacidad;
	}



	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}



	public int getAsientosOcupados() {
		return asientosOcupados;
	}



	public void setAsientosOcupados(int asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}



	public int contarAsientosDisp() {
		return capacidad - asientosOcupados;
	}
	
}
