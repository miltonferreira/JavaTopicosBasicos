package Basico;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escreva um texto: ");
		
		str = sc.nextLine();
		
		System.out.println(str);
		
		sc.close();

	}

}
