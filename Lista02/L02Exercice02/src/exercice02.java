public class exercice02 {

	public static void main(String[] args) {
		int[] seqFibo = new int[16];
		int cont = 0;
        int num1 = 1;
        int num2 = 0;
        int num3 = 0;
  
        while (cont< 16) {
        	seqFibo[cont] = num1;
            num3 = num1;        
            num1 = num1 + num2;
            num2 = num3;

            cont++;                
        }
        System.out.println("Os primeiros 15 elementos da sequência de Fibonacci:"); 
        for (int i = 0; i < seqFibo.length; i++) {
			System.out.println(seqFibo[i]); 
		}
		      
	}
}