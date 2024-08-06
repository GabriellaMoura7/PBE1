package programacao_backend;

import java.util.Scanner;

public class condicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos minutos você usou?");
		int minutos = sc.nextInt();
		
		double conta = 50.00;
		
		if (minutos>100) {
			conta = conta + (minutos-100) * 2;
		}
		
		System.out.println("O valor da conta é: " + conta);
		conta += (minutos-100) * 2;
	}

}
