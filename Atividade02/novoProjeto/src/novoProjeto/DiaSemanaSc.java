package novoProjeto;

import java.util.Scanner;

public class DiaSemanaSc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um número: ");
		int num = sc.nextInt();
		
		String dia;
		
		switch (num) {
		case 1:
			dia = "Domingo";
			break;
			
		case 2:
			dia = "Segunda";
			break;
			
		case 3:
			dia = "Terça";
			break;
			
		case 4:
			dia = "Quarta";
			break;
			
		case 5:
			dia = "Quinta";
			break;
			
		case 6:
			dia = "Sexta";
			break;
			
		case 7:
			dia = "Sabádo";
			break;
			
			default:
				dia = "valor invalido";
				break;
		}
		
		System.out.println("Dia da semana: " + dia);
		sc.close();

	}

}
