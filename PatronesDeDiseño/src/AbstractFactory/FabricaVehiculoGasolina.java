package AbstractFactory;

public class FabricaVehiculoGasolina extends FabricaVehiculo {

	public FabricaVehiculoGasolina() {
		
	}

	@Override
	public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
		
		return new AutomovilGasolina(modelo, color, potencia, espacio);
	}

	@Override
	public Scooter creaScooter(String modelo, String color, int potencia) {
		
		return new ScooterGasolina(modelo, color, potencia);
	}

}
