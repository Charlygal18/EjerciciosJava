import java.util.ArrayList;
import java.util.Scanner;

public class SumaNumeros {
	public static void main(String[] args) {
		int numero = 0;
		Boolean bandera = true;
		ArrayList<Integer> enteros = new ArrayList<>();
 		int suma = 0;
		Scanner scanner = new Scanner(System.in);
		while(bandera) {
			System.out.println("Ingrese un número entero: ");
			numero = scanner.nextInt();
			if(numero == 0) {
				bandera = false;
			}
			else if(numero > 0) {
				enteros.add(numero);
			}
			else if(numero < 0) {
				System.out.println("Solo números enteros positivos");
			}
			
		}
		for(int num : enteros) {
			suma += num;
		}
		System.out.println("Los números introducidos son: " +  enteros);
		System.out.println("La suma de todos los numeros introducidos es: " + suma);
	}

}
