package es.studium.ed_2_ej2;

public class ed_2_ej1
{

	private static final String EL_FACTORIAL_DE = "El factorial de ";
	public static void main(String[] args)
	{

		int numero;
		Numero3();
		extraerSegundoNum();
	}
	private static void extraerSegundoNum()
	{
		int numero;
		numero = 5;
		System.out.println(EL_FACTORIAL_DE + numero + " es " + calcularFactorial(numero));
	}
	private static void Numero3()
	{
		int numero = 3;
		System.out.println(EL_FACTORIAL_DE + numero + " es " + calcularFactorial(numero));
	}
	public static double calcularFactorial(double n) {
		if (n == 0) {
			return 1;
		} else {
			double resultado = n * calcularFactorial(n - 1);
			return resultado;
		}
	}

}


