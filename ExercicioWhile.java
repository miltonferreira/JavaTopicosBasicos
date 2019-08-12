package Basico;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		
		senhaAdivinha();
		
	}
	
	public static void senha() {
		
		show("Insira uma senha");
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		while(x != 2002) {
			show("Senha Incorreta, insira  a senha correta");
			x = sc.nextInt();
		}
		
		show("Acesso Permitido");
		sc.close();
	}
	
	public static void senhaNova() {
		
		show("Crie uma senha");
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		
		show("Insira a senha");
		int y = sc.nextInt();
		
		while(x != y) {
			show("Senha Incorreta, insira  a senha correta");
			y = sc.nextInt();
		}
		
		show("Acesso Permitido");
		sc.close();
	}
	
	public static void senhaAdivinha() {
		
		int y = 0;
		int x = 0;
		
		show("Crie uma senha de 0 a 100");
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		while(x < 0 || x > 100) {
			
			show("Senha fora de 0 a 100");
			x = sc.nextInt();
		}
		
		while(x != y) {
			show("Senha Incorreta, insira a senha correta");
			y += 1;
			show("Tentativa: " + y);
		}
		
		show("Acesso Permitido, senha correta: " + y);
		sc.close();
	}
	
	public static void show(String str) {
		System.out.println(str);
	}
	
}
