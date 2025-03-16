package exe001;


import java.util.Scanner;

public class Exe001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escreva seu nome: ");
		String nome = teclado.nextLine();
		
		System.out.println("Qual sua data de nascimento? ");
		int anoNascimento = teclado.nextInt();
		int idade = 2025 - anoNascimento;
		System.out.println("Olá seu nome é: " + nome + " e você tem " + idade + " anos.");

	}

}
