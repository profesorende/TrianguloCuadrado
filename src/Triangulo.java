import java.util.Scanner;

//clase para obtener el lado mayor de un triángulo y si es equilatero o no

//comentario para seguir probando


public class Triangulo {
	private Scanner teclado;
	private int lado1, lado2, lado3;
	
	public void inicializar(){
		teclado=new Scanner(System.in);
		System.out.print("Lado 1: ");
		lado1=teclado.nextInt();
		System.out.print("Lado 2: ");
		lado2=teclado.nextInt();
		System.out.print("Lado 3: ");
		lado3=teclado.nextInt();
	}
	public void ladoMayor(){
		System.out.print("El lado mayor es ");
		if (lado1>lado2 & lado1>lado3){
			System.out.println ("lado 1 = "+lado1);
		}
		else{
			if (lado2>lado1 && lado2>lado3){
				System.out.println ("lado 2: "+ lado2);
			}
			else {
				System.out.println ("lado 3: "+ lado3);
			}
		}
	}
	public void esEquilatero(){
		if (lado1==lado2 && lado1==lado3){
			System.out.println ("Triángulo equilátero");
		}
		else {
			System.out.println ("Triángulo NO equilátero");
		}
	}
}
