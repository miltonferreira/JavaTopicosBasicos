package Basico;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um numero de 1 a 1000: ");
		
		int x = sc.nextInt();
		
		while(x < 1 || x > 1000) {
			
			System.out.println("Insira um numero de 1 a 1000: ");
			x = sc.nextInt();
			
		}
		
		impar(x);
		par(x);
		sc.close();
		
	}
	
	public static void impar(int x) {
		
		for(int i = 0; i <= x; i++) {
			if(i % 2 == 1) {
				System.out.println("O " + i + " é impar");
			}
		}
		
		System.out.println("----------");
		
	}
	
	public static void par(int x) {
		
		for(int i = 0; i <= x; i++) {
			if(i % 2 == 0) {
				System.out.println("O " + i + " é par");
			}
		}
		
	}

}
