package ejecucion;

public class EjecucionTelevisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisor tv1 = new Televisor();
		
	//está apagado
		tv1.prender();
		tv1.setCanal(13);
		
		tv1.apagar();
		
		tv1.setVolumen(10);
		
		
		
		System.out.println("Está en el canal: "+ tv1.getCanal());
	}

}
