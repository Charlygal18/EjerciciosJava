import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {

	public static void main(String[] args) {
		
		double ventas[] = new double[30];
		ArrayList<Double> ventasMayoresDosMil = new ArrayList<>();
		// La mejor forma para cerrar el Scanner, después del try se cierra automáticamente
		try (Scanner scanner = new Scanner(System.in)) {
			
			for (int i = 0; i < ventas.length; i++) {
				System.out.println("Ingrese el valor de la venta " + (i + 1) + ": ");
				ventas[i] = scanner.nextDouble();
				if (ventas[i] > 2000) {
					ventasMayoresDosMil.add(ventas[i]);
				}

			}
		}
		
		System.out.println("Las ventas mayores fueron: " + ventasMayoresDosMil);
		System.out.println("EL número de ventas mayores fueron: " + ventasMayoresDosMil.size());

	}
}
