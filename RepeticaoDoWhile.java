package Basico;

import java.util.Locale;
import java.util.Scanner;

public class RepeticaoDoWhile {

	public static void main(String[] args) {
		
		raiz();

	}
	
	public static void raiz() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		double x = 0;
		char resp;
		
		do {
			
			show("Insira um valor para raiz");
			x = sc.nextDouble();
			double r = Math.sqrt(x);
			System.out.printf("A raiz é = %.3f%n", r);
			
			show("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
			
		}while(resp != 'n');
		
		sc.close();
		
	}
	
	public static void show(String  str) {
		System.out.println(str);
	}

}
