package exe003;

import java.util.Scanner;

public class Exe003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num1 = teclado.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = teclado.nextInt();
		System.out.println("Digite o terceiro número: ");
		int num3 = teclado.nextInt();
		System.out.println("Digite o quarto número: ");
		int num4 = teclado.nextInt(); 
		
		int soma = num1 + num2 + num3 + num4;
		System.out.println("A soma dos números: " +num1+ " , " +num2+ " , " +num3+ " e " +num4+ " é igual a " +soma);
	}

}
