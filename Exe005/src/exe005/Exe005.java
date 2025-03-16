package exe005;

import java.util.Scanner;

public class Exe005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		// ENTRADA DE DADOS
		System.out.println("Digite o valor do preço unitário: ");
		double precoUnitario = teclado.nextDouble();
		System.out.println(precoUnitario);
		
		System.out.println("Digite a quantidade vendida: ");
		double quantidade = teclado.nextDouble();
		System.out.println(quantidade);
		
		System.out.println("Digite o desconto: ");
		double desconto = teclado.nextDouble();
		System.out.println(desconto);
		
		//Cálculo da venda
		
		double totalSemDesconto = precoUnitario * quantidade;
		double precoFinal = totalSemDesconto - desconto;
		
		System.out.println("O valor final é: " +precoFinal);
		
		
		
		
	}

}
