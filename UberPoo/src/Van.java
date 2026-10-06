
public class Van extends Veiculo implements IVeiculo{
	
	public Van() {
		
	}

	public Van(String placa, String modelo, String cor, int ano, int capacidadePassageiros) {
		super(placa, modelo, cor, ano, capacidadePassageiros);
	}

	@Override
	public double calculoTarifa(double distancia) {
		
		return 8 + distancia;
	}
	
	
	
}
