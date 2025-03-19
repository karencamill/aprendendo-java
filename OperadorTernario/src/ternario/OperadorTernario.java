package ternario;

public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int n1, n2, r;
		n1 = 9;
		n2 = 8;
		r = (n1>n2) ?0:1; //Se a condição for verdadeira executa depois do ? se não executa depois dos :
		System.out.println(r);*/

		String nome1 = "Karen";
		String nome2 = "Karen";
		String nome3 = new String("Karen"); // Não é igual, o conteúdo que é igual.
		String resultado;
		
		//resultado = (nome1 == nome2) ?"igual" : "diferente";
		//System.out.println(resultado);
		
		resultado = (nome1.equals(nome3)) ? "igual" : "diferente"; //equals = método que verifica se o conteúdo de um método é igual ao outro
		System.out.println(resultado);
	}

}
