package vetor;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//EXEMPLO 01
		int n []= {3, 4, 8, 9, 6, 2};
		System.out.println("O número de casas é " + n.length);
		for (int c=0; c<=5; c++){
			System.out.println("Na posição " + c + " temos o valor " + n[c]);
		}

		//EXEMPLO 02
		String mes [] = {"Jan", "Fev", "Mar", "Abr", "Mai",
				"Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};		
		int tot [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int c=0; c<mes.length; c++) {
			System.out.println("O mês de " + mes[c]+ " tem " + tot[c]+ " dias ao todo." );
		}

		//EXEMPLO 03
		double v[] = {4.2, 1.9, -8, 6};
			for(double valor: v){
			System.out.print(valor + " ");
		}
		
	}
}
