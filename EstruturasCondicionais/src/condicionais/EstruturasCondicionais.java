package condicionais;

import java.util.Scanner;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("PRIMEIRO EXEMPLO");
		
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

		System.out.println("SEGUNDO EXEMPLO");
		
		System.out.println("Escreva seu ano de nascimento: ");
		int nasc = teclado.nextInt();
		
		int idade = 2025 - nasc;
		System.out.println(idade);
		
		if(idade < 16) {
			System.out.println("Não Vota");
		}else {
			if((idade>16 && idade<18) || (idade>70)){
				System.out.println("Voto Opcional");		
			} else {
				System.out.println("Voto Obrigatório");
			}
		}
		
		System.out.println("TERCEIRO EXEMPLO");
		
		System.out.println("Digite um valor: ");
		int valor = teclado.nextInt();
		
		if(valor % 2 == 0) {
			System.out.println("O número é PAR");
		}else {
			System.out.println("O número é ÍMPAR");
		}

		
	}
}
