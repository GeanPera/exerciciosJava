import java.util.Scanner;

public class exercice03 {

	public static void main(String[] args) {
		/*
		Crie um programa para receber a altura, peso e calcule o imc. IMC = peso / (altura x altura).
			16 a 16,9 kg/m² - Muito abaixo do peso
			17 a 18,4 kg/m² - Abaixo do peso
			18,5 a 24,9 kg/m² - Peso normal
			25 a 29,9 kg/m² - Acima do peso
			30 a 34,9 kg/m² - Obesidade grau I
			35 a 40 kg/m² - Obesidade grau II
			maior que 40 kg/m² - Obesidade grau III...
		*/
		char permissao = 'S';
		while (permissao == 's' || permissao == 'S') {
			Scanner tc = new Scanner(System.in);
			
			System.out.println("Calcule o seu IMC:");
			System.out.println("  ");
			System.out.println("Digite seu peso:");
			System.out.println("  ");
			
			double peso = tc.nextDouble();
			
			System.out.println("  ");
			System.out.println("Digite sua altura:");
			System.out.println("  ");
			
			double altura = tc.nextDouble();
			
			double imc = peso / (altura * altura);
			
			System.out.println("  ");
			System.out.println("Seu IMC e de " + imc + "kg/m²");
			
			if (imc < 16.9) {
				System.out.println("Muito abaixo do peso");
				
			} else if (imc < 18.4) {
				System.out.println("Abaixo do peso");
				
			} else if (imc < 24.9) {
				System.out.println("Peso normal");
				
			} else if (imc < 29.9) {
				System.out.println("Acima do peso");
				
			} else if (imc < 34.9) {
				System.out.println("Obesidade grau I");
				
			} else if (imc < 40) {
				System.out.println("Obesidade grau II");
				
			} else {
				System.out.println("Obesidade grau III");
				
			}
			permissao = 'n';
			System.out.println("  ");
			System.out.println("Deseja calcular outro IMC? s/n");
			System.out.println("  ");
			
			permissao = tc.next().charAt(0);
		}
		if (permissao != 's' && permissao != 'S') {
			System.out.println("Programa encerrado....");
		}
	}
}
