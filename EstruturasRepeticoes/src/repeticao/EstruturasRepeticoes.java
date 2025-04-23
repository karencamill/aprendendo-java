package repeticao;

public class EstruturasRepeticoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//EXEMPLO 1
		int cc = 1;
		while (cc <= 10) {	
			System.out.println("Cambalhota" + cc);	
				cc++;
			}

		// EXEMPLO 2
		Scanner teclado = new Scanner(System.in);
		System.out.println("Vamos calcular o fatorial");
		System.out.println("Digite um número: ");
		int n = teclado.nextInt();
		
		int f = 1;
		int c = n;
		
		while (c>=1) {
			f *= c;
			c--;
		}		
		System.out.print(f);

		// EXEMPLO 3

		Scanner teclado = new Scanner(System.in);
		int n, s=0;
		String resposta;
		do {
		System.out.print("Digite um número: ");
		n = teclado.nextInt();
		s += n;// s = s + n;
		
		System.out.print("Quer continuar? [S/N] ");
		resposta = teclado.next();
		
		} while (resposta.equals("S"));
		System.out.println("A soma de todos os valores é: " + s);

		// EXEMPLO 4

		for (int c=0; c<=100; c+=10) {
			System.out.println(c);
		}
		
			
	     }
	}
