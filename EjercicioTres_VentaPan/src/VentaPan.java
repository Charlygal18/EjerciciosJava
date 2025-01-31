import java.util.Scanner;

public class VentaPan {

	public static void main(String[] args) {
		int piezasPan = 0;
		double totalPago = 0.00;
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese el total de piezas de pan a comprar: ");
			piezasPan = scanner.nextInt();
		}
		
		if(piezasPan > 100) {
			totalPago = piezasPan * 4.00;
		}
		else if(piezasPan > 50 && piezasPan <= 100) {
			totalPago = piezasPan * 4.50;
		}
		else {
			totalPago = piezasPan * 5.00;
		}
		System.out.println("El total que debe pagar es: $" + totalPago);

	}

}
