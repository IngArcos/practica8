import java.text.DecimalFormat;

public class HerenciaAbstracta{
	public static void main(String[] args) {
		DecimalFormat dosDigitos = new DecimalFormat("0.00");

		Punto punto = new Punto(7,11);
		Circulo circulo = new Circulo(22,8,3.5);
		Cilindro cilindro = new Cilindro(20,30,3.3,10.75);

		System.out.println("Nombre y representacion de cadena: ");
		System.out.println(punto.obtenerNombre() + ": " + punto + "\n" + circulo.obtenerNombre() + ":" + circulo + "\n" + cilindro.obtenerNombre() + ": " + cilindro + "\n");

		Figura arregloDeFiguras[] = new Figura[3];

		arregloDeFiguras[0] = punto;
		arregloDeFiguras[1] = circulo;
		arregloDeFiguras[2] = cilindro;

		System.out.println("\nNombre e invocaciones: ");
		for(int i = 0; i < arregloDeFiguras.length; i++){
			System.out.println(arregloDeFiguras[i].obtenerNombre());
			System.out.println(arregloDeFiguras[i].toString());
			System.out.println(arregloDeFiguras[i].obtenerArea());
			System.out.println(arregloDeFiguras[i].obtenerVolumen());
			System.out.println("\n");
		}
	}
}
