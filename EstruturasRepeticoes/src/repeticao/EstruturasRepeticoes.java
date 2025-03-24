package repeticao;

public class EstruturasRepeticoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
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
					
	     }
	}


