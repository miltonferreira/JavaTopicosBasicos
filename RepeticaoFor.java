package Basico;

import java.util.Locale;
import java.util.Scanner;

public class RepeticaoFor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		show("Quantos numeros quer somar?");
		show("Soma: " + soma(sc.nextInt()));
		sc.close();

	}
	
	public static void show(String str) {
		System.out.println(str);
	}
	public static void show(double str) {
		System.out.println(str);
	}
	
	public static double soma(int r) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sum = 0;
		
		for(int i = 1; i <= r; i++) {
			
			show("Insira o numero #" + i);
			sum += sc.nextDouble();
		}
		
		sc.close();
		return sum;
		
	}

}
