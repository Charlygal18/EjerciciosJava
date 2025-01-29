import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class NumeroMayor {
	public static void main(String[] args) {

		int longitudLista = 5;
		ArrayList<Double> listaNumeros = new ArrayList<>();
		Double numeroMayor = 0.0;
		DecimalFormat df = new DecimalFormat("#.##");
		// Se crea una lista con 5 números aleatorios Double de dos decimales
		for (int i = 0; i < longitudLista; i++) {
			double numero = ThreadLocalRandom.current().nextDouble(1.0, 100.0);
			double numeroRedondeado = Double.parseDouble(df.format(numero));
			listaNumeros.add(numeroRedondeado);
		}
		for (int i = 0; i < 1; i++) {
			for (int j = 1; j < listaNumeros.size(); j++) {
				if (listaNumeros.get(i) > listaNumeros.get(j) && listaNumeros.get(i) > numeroMayor) {
					numeroMayor = listaNumeros.get(i);
				} else if (listaNumeros.get(j) > numeroMayor) {
					numeroMayor = listaNumeros.get(j);
				}
			}
		}
		System.out.println("La lista de números es: " + listaNumeros);
		System.out.println("El número mayor de la lista es: " + numeroMayor);

	}

}
