package ejecucion;

public class Televisor {
	private boolean estado;
	private int volumen;
	private int canal;
	
	public Televisor() {
		estado = false;
		volumen = 0;
		canal = 0;
	}
	
	public void prender() {
		estado = true;
	}
	
	public void setVolumen(int volumen) {
		if(estado)
			this.volumen = volumen;
		else
			System.out.println("No se puede modificar el volumen si el tv está apagado");
		
	}
	
	public void setCanal(int canal) {
		if(estado)
			this.canal = canal;
		else
			System.out.println("No se puede modificar el canal si el tv está apagado");
	}
	
	public boolean estaPrendido() {
		return estado;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void apagar() {
		estado = false;
	}
	
}
