
public class Moto extends Veiculo implements IVeiculo {
	
	public Moto() {
		
	}

	public Moto(String placa, String modelo, String cor, int ano, int capacidadePassageiros) {
		super(placa, modelo, cor, ano, capacidadePassageiros);
	}

	@Override
	public double calculoTarifa(double distancia) {
		
		return 3 + distancia;
	}
	
	
}
