package ejecucion;

public class Ejemplo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaClase unObjeto = new UnaClase();
		UnaClase otroObjeto = new UnaClase();
		
		unObjeto.SetSaludo("Hola Mundo");
		//unObjeto.saludo = "Hola Mundo 2";
		
		System.out.println(unObjeto.getSaludo());
	}

}
