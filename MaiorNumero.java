package Basico;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os 3 numeros: ");
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		int v3 = sc.nextInt();
		
		System.out.println("O maior valor é: " + compara(v1,v2,v3));
		
		sc.close();
		
	}
	
	public static int compara(int v1, int v2, int v3) {
		
		if(v1 > v2 && v1 > v3) {
			return v1;
		}else if (v2 > v3) {
			return v2;
		}else {
			return v3;
		}
		
	}
	
}