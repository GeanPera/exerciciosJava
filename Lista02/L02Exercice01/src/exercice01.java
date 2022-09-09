import java.util.Scanner;

public class exercice01 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		double[] temperaturas = {24,25,26,22,23,27,30,20,21,18,24,25,26,22,23,27,30,20,21,18,24,25,26,22,23,27,30,20,21,18};
		
		System.out.println(temperaturas.length);
		double media = 0;
		double somaTemps = 0;
		
		for (int i = 0; i < temperaturas.length; i++) {
			somaTemps = somaTemps + temperaturas[i];
		}
		System.out.println(somaTemps);
		media = somaTemps / temperaturas.length;
		System.out.println(media);
		
		boolean isTrue = true;
		while (isTrue ) {
			
			System.out.println("De qual dia vc quer saber a temperatura?");
			int diaPesquisa = tc.nextInt();
			
			if (diaPesquisa >= 1 && diaPesquisa <= 30) {
				System.out.println("A temp. desse dia é de " + temperaturas[diaPesquisa-1]);
				System.out.println("");
			} else {
				System.out.println("Informe um dia maior que -1 e menor que 31");
				System.out.println("");
			}
		}
	}
}
