public class RelacionJerarquica{
	public static void main(String[] args){
		Punto punto=new Punto(30,50);
		Circulo circulo=new Circulo(120,89,2.7);

		System.out.println("Llamada a toString de Punto con referencia a la superclase apuntando al objeto de la superclase:\n"+punto.toString());
		System.out.println("Llamado a toString de Circulo con referencia a la subclase apuntando al objeto de la subclase:\n"+circulo.toString());

		Punto refPunto=circulo;
		System.out.println("Llamado a toString de Circulo con referencia a la superclase apuntando al objeto de la subclase:\n"+circulo.toString());

		//Modificación ejercicio 3
		circulo = (Circulo)punto;
	}
}
