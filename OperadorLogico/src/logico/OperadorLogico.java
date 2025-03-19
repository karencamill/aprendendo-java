package logico;

public class OperadorLogico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y, z;
		x = 4;
		y = 6;
		z = 3;
		boolean resultado;
		
		//resultado = (x>y && y>z) ?true:false; && as duas expressões tem que ser V
		//resultado = (x>y || y>z) ?true:false; || uma das expressões tem que ser V
		resultado = (x>y ^ y==z) ?true:false; // ^ apenas uma das expressões pode ser V
		System.out.println(resultado);
		
	}

}
