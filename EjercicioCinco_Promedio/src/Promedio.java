import java.util.ArrayList;
import java.util.Scanner;

public class Promedio {

	public static void main(String[] args) {
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		int contador = 0;
		int numero = 0;
		int numeroDatos = 0;
		Double media = 0.00;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("¿Cuántos números quiere capturar?");
			numeroDatos = scanner.nextInt();

			while(contador < numeroDatos) {
				System.out.println("Introduce un número entero positivo: ");
				numero = scanner.nextInt();
				
				if (numero < 0) {
					System.err.println("Solo se permiten números enteros positivos");
				} else {
					listaNumeros.add(numero);
					contador++;
				}
			}
		}
		for(int num : listaNumeros) {
			media += num;
		}
		media = media / listaNumeros.size();
		System.out.println("Los números capturados fueron: " + listaNumeros);
		System.out.println("La media de los números es: " + media);
		
	}

}
