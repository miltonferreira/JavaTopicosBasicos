package Basico;

import java.util.Locale;
import java.util.Scanner;

public class RepeticaoWhile {

	public static void main(String[] args) {
		
		double x = 0.0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcule uma raiz positiva");
		x = sc.nextDouble();
		
		while(x >= 0.0) {
			
			double value = raiz(x);
			System.out.printf("%.3f%n", value);
			System.out.println("Calcule uma raiz positiva");
			x = sc.nextDouble();
			
		}
		
		System.out.println("Valor negativo");
		
		sc.close();
		
	}
	
	public static double raiz(double x) {
			
		x = Math.sqrt(x);
		
		return x;
	}
	
}
