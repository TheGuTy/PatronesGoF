package Builder;

import java.util.Scanner;

public class ClienteVehiculo {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		ConstructorDocumentacionVehiculo constructor;
		System.out.print("Desea generar " + "documentacion HTML (1) o PDF (2):");
		int seleccion = reader.nextInt();
		
		if (seleccion == 1)
			constructor = new ConstructorDocumentacionVehiculoHtml();
		else
			constructor = new ConstructorDocumentacionVehiculoPdf();
		
		Vendedor vendedor = new Vendedor(constructor);
		Documentacion documentacion = vendedor.construye("Martin");
		documentacion.imprime();
	}

}
