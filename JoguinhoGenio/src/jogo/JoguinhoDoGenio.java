package jogo;

import java.util.Scanner;

public class JoguinhoDoGenio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		String resultado;
			
		System.out.println("Digite um número entre 1 e 5: ");
		int num = teclado.nextInt();
		
		double n = 1 + Math.random() * (6 - 1);
		int valor = (int) n;
		System.out.println(valor);
		
		resultado = (valor == num) ?"ACERTOU":"ERROU!";
		System.out.println(resultado);
			
	}

}
