package Negocio;

public class Cabotaje extends Vuelo {
	private String categoria;
	
	public Cabotaje (int nroVuelo, String destino, int capacidad, int asientosOcupados, String categoria) {
		super(nroVuelo, destino, capacidad, asientosOcupados);
		this.categoria = categoria;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
