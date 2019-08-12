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
		
		System.out.println("Valor é: " + preco + " e o desconto é: " + desconto);
		System.out.println("Preço com desconto: " + (preco - desconto));
		
	}
	
}
