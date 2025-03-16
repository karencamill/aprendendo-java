package exe004;

import java.util.Scanner;

public class Exe004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = teclado.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double num2 = teclado.nextDouble();
		
		System.out.println("Digite o terceiro número: ");
		double num3 = teclado.nextDouble();
		
		double media = (num1 + num2 + num3) / 3;
		
		System.out.println("A média da soma dos três números é : " +media);
		
	}

}
