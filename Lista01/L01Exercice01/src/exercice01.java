import java.util.Scanner;

public class exercice01 {

	public static void main(String[] args) {
		
		double notas = 0;
		double media = 0;
		short contador = 0;
		boolean isTrue = true;
		
		while (isTrue) {
			contador++;
			Scanner tc = new Scanner(System.in);
			notas = notas + tc.nextDouble();
			media = notas / contador;
			System.out.println("Soma das notas: " + notas);
			System.out.println("Qtd de notas digitadas: " + contador);
			System.out.println("Média: " + media);
		}
	}
}
