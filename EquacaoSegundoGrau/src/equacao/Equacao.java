package equacao;

import java.util.Scanner;

public class Equacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor de b: ");
		int b = teclado.nextInt();
		
		System.out.println("Digite o valor de a: ");	
		int a = teclado.nextInt();
		
		System.out.println("Digite o valor de c: ");
		int c = teclado.nextInt();
		
		double d = Math.pow(b, 2) - 4 * a * c;
		System.out.println(d);
		
		if (d < 0) {
			System.out.println("Não existem raízes reais");
		}else {
			System.out.println("Existem raízes reais");
		}
	}

}
