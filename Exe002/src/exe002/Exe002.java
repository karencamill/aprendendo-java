package exe002;

import java.util.Scanner;

public class Exe002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		double num1 = teclado.nextDouble();
		System.out.println("O primeiro número digitado foi " + num1);
		
		System.out.println("Digite o segundo número: ");
		double num2 = teclado.nextDouble();
		System.out.println("O segundo número digitado foi " + num2);
		
		double multiplicacao = num1 * num2;
		System.out.println("A multiplicação entre " + num1 + " e " + num2+ " é igual a : " + multiplicacao);
				
		
		

	}

}
