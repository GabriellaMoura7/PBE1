package programacao_backend;

import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o seu número?");
		int numero = sc.nextInt();
		
		System.out.print("Por quantas horas você trabalhas?");
		int hora = sc.nextInt();
		
		System.out.print("Qual é o valor que você recebe por hora?");
		int recebe = sc.nextInt();
		
		System.out.println("O seu número é: " +numero+ "e o salário é de: " + hora*recebe+",00");

	}

}
