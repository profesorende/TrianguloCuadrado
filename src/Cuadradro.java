import java.util.Scanner;

public class Cuadradro {
	private int lado;
	Scanner teclado = new Scanner(System.in);
	public void iniciar(){
		System.out.println("lado: ");
		lado=teclado.nextInt();
	}
	public void perimetro(){
		System.out.println("Perimetro: "+lado*4);
	}
	public void superficie(){
		System.out.print("Superficie: "+lado*lado);
	}
}
