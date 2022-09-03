import java.util.Scanner;

public class exercice02 {
	/*
	Crie um programa para calcular a área das formas geométricas básicas.
		a. Círculo (pedir o raio);
		b. Retângulo (pedir o tamanho os lados);
		c. Triangulo retângulo (pedir a base e altura);
		d. Triangulo Equilátero: pedir o lado.

	O programa deverá exibir um menu para que se possa escolher a forma geométrica.
	O programa deverá permitir que se calcule a área de diversos objetos.
	*/

	public static void main(String[] args) {
		 
		boolean isTrue = true;
		while (isTrue) {
			
			Scanner tc = new Scanner(System.in);
			System.out.println("Digite o numero correspondente a forma geométrica que vc quer calcular a área");
			System.out.println("1 = Círculo");
			System.out.println("2 = Retângulo");
			System.out.println("3 = Triangulo Retângulo");
			System.out.println("4 = Triangulo Equilátero");
			
			int forma = tc.nextInt();
			System.out.println("  ");
			
			switch (forma) {
			case 1:
				System.out.println("Círculo");	
				
				areaCirculo(tc);
				break;
				
			case 2:
				System.out.println("Retângulo");
				areaRetangulo(tc);
				break;
				
			case 3:
				System.out.println("Triangulo Retângulo");
				areaTriRetangulo(tc);
				break;
				
			case 4:
				System.out.println("Triangulo Equilátero");
				areaTriEquilatero(tc);
				break;
				
			}
		}
	}
	public static void areaCirculo(Scanner tc) {
		
		System.out.println("Digite o raio:");
		double raio = tc.nextDouble();
		
		System.out.println("A área é: " + (raio * raio) * Math.PI);
		System.out.println("  ");
	}
	public static void areaRetangulo(Scanner tc) {
		
		System.out.println("Digite o altura:");
		double altura = tc.nextDouble();
		
		System.out.println("Digite o base:");
		double base = tc.nextDouble();
		
		System.out.println("A área é: " + base * altura);
		System.out.println("  ");
	}
	public static void areaTriRetangulo(Scanner tc) {
		
		System.out.println("Digite o altura:");
		double altura = tc.nextDouble();
		
		System.out.println("Digite o base:");
		double base = tc.nextDouble();
		
		System.out.println("A área é: " + (base * altura) / 2);
		System.out.println("  ");
	}
	public static void areaTriEquilatero(Scanner tc) {
		
		System.out.println("Digite o lado:");
		double lado = tc.nextDouble();
		
		System.out.println("A área é: " + ((lado * lado) * Math.sqrt(3))/4);
		System.out.println("  ");
	}
}
