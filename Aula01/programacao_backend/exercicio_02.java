package programacao_backend;

import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double a = 0;
		
		System.out.printf("Qual o raio do círculo?");
		double r = sc.nextDouble();
		a = pi*r*r;
		System.out.printf("A área do círculo é: %.4f", a);
		
		sc.close();
		
		

	}

}
