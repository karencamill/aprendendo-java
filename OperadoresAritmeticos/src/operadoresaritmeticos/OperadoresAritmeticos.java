package operadoresaritmeticos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int n1 = 3;
		int n2 = 5;
		
		float m = (n1 + n2) / 2;
		System.out.println("A média é: " + m);*/

		//DECREMENTO E INCREMENTO

		/*int numero = 3;
		int valor = 4 + numero--;
		int resultado = numero;
		
		System.out.println(valor);
		System.out.println(resultado);*/

		//OPERADORES DE ATRIBUIÇÃO
		
		/*int x = 4;
		x += 2; // x = x + 2
		System.out.println(x);
		
		int y = 9;
		y *= 3; // x = x * 3
		System.out.println(y);*/

		//CLASSE MATH
		
		/*float v = 8.9f;
		int ar = (int) Math.floor(v); // arredonda para baixo
		System.out.println(ar);
		
		
		float valor = 5.8f;
		int arr = (int) Math.ceil(valor); // arredonda para cima
		System.out.println(arr);*/

		double ale = Math.random(); // gera um número aleatório
		int n = (int) (10 + ale * (50-10));
		System.out.println(n);

		
	}

}
