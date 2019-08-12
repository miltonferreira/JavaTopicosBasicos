package Basico;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		int bed;
		double price;
		
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		System.out.println("How many bedrooms ate there in your house: ");
		bed = sc.nextInt();
		System.out.println("Enter product price: ");
		price = sc.nextDouble();
		System.out.println("Enter your last name, age and height (same line): ");
		String s = sc.next();
		int a = sc.nextInt();
		double h = sc.nextDouble();
		
		System.out.printf("Name:%s %s  Age:%d  height:%.2f  Bedrooms:%d  Price:%.2f", name, s, a, h, bed, price);
		
		sc.close();
		
	}

}
