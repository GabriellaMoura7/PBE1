package programacao_backend;

import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Defina o primeiro valor: ");
		int y = sc.nextInt();
		
		System.out.println("Defina o segundo valor: ");
		int x = sc.nextInt();
		
		System.out.print("A soma de todos os números é: " + (y+x));
		
		sc.close();

	}

}
