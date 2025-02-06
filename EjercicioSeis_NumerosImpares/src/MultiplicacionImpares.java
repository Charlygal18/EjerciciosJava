
public class MultiplicacionImpares {

	public static void main(String[] args) {
		int contadorImpares = 0;
		int numero = 1;
		int impares = 10;
		long total = 1;
		while(contadorImpares < impares) {
			if((numero % 2) != 0) {
				total *= numero;
				contadorImpares++;
			}
			numero++;
		}
		System.out.println("El total de la multiplicación de los primeros 10 números impares es: " + total);
	}
}
