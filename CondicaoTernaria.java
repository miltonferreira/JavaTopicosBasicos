package Basico;

import java.util.Scanner;

public class CondicaoTernaria {

	static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		
		ternaria(sc.nextInt());
		
		sc.close();
		
	}
	
	public static void ternaria(int value) {
		
		int preco = value;
		
		double desconto = (preco > 50) ? preco * 0.01 : preco * 0.005;
		
		System.out.println("Valor �: " + preco + " e o desconto �: " + desconto);
		System.out.println("Pre�o com desconto: " + (preco - desconto));
		
	}
	
}
