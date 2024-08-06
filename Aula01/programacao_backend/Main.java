package programacao_backend;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
      Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual seu nome? ");
      String nome = sc.next();
      
      System.out.print("Qual é a sua idade:");
      int idade = sc.nextInt();
      
      System.out.print("Qual é a sua renda?");
      double renda = sc.nextDouble();
      
      System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
      sc.close();
	}

}
