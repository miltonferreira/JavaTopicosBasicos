package Basico;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		int dia;
		String day;
		int loop = 3;

		Scanner sc = new Scanner(System.in);

		for(int i = 0; i <= loop; i++) {
			System.out.print("Digite um dia: ");
	
			dia = sc.nextInt();
	
			switch (dia) {
			case 1:
				day = "Segunda";
				break;
			case 2:
				day = "Terça";
				break;
			case 3:
				day = "Quarta";
				break;
			case 4:
				day = "Quinta";
				break;
			case 5:
				day = "Sexta";
				break;
			case 6:
				day = "Sabado";
				break;
			default:
				day = "Dia invalido";
				break;
			}
			
			loop += 1;	//nunca termina o loop
			System.out.println(day);
			
		}
		
		sc.close();
		
	}

}
