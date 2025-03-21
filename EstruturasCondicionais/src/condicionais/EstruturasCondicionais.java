package condicionais;

import java.util.Scanner;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		float n1 = teclado.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		float n2 = teclado.nextFloat();
		
		System.out.println("Digite a terceira nota:  ");
		float n3 = teclado.nextFloat();
		
		float m = (n1 + n2 + n3) / 3;
		System.out.println("A sua média é: " +m);
		
		if (m >= 7) {
			System.out.println("Aprovadinho!!!!!");
		}else{
			System.out.println("Tomou foi dentrooo.");
		
 	   }
		
	}
}




