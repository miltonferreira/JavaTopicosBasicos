package Basico;

import java.util.Locale;

public class SaidaDados {
	
	public static void main(String[] args) {
		
		char gender = 'F';
		int age = 32;
		double balance = 10.35784;
		String name = "Maria";
		
		System.out.printf("%.0f%n",balance);
		System.out.printf("%.2f%n",balance);
		System.out.printf("%.4f%n",balance);
		
		System.out.println("----------------");
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.1f%n",balance);
		System.out.printf("%.2f%n",balance);
		
		System.out.println("----------------");
		System.out.printf("%s is %d years old, gender %c, and got balance = %.2f of money%n", name, age, gender, balance);
	}
	
}
