import java.util.ArrayList;
import java.util.Scanner;

public class Promedios {
	
	public static void main(String[] args) {
		int numCeros = 0;
		int numerosTotales = 10;
		double promedioPositivos = 0.00;
		double promedioNegativos = 0.00;
		ArrayList<Integer> positivos = new ArrayList<>();
		ArrayList<Integer> negativos = new ArrayList<>();

		try (Scanner scanner = new Scanner(System.in)) {
			for (int i = 0; i < numerosTotales; i++) {
				System.out.println("Introduce un número entero (+, - o 0): ");
				int numero = scanner.nextInt();
				if(numero > 1) {
					positivos.add(numero);
				}
				else if(numero < 0) {
					negativos.add(numero);
				}
				else {
					numCeros++;
				}
			}
		}
		for(int num : positivos) {
			promedioPositivos += num;
		}
		promedioPositivos = promedioPositivos / positivos.size();
		
		for(int num : negativos) {
			promedioNegativos += num;
		}
		promedioNegativos = promedioNegativos / negativos.size();
		
		System.out.println("El promedio de los números positivos es: " + String.format("%.2f", promedioPositivos)); 
		System.out.println("El promedio de los números negativos es: " + String.format("%.2f", promedioNegativos)); 
		System.out.println("El número de ceros es: " + numCeros);
	}

}
