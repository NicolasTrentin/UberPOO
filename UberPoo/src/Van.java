
public class Van extends Veiculo{
	
	public final double VALOR_BASE = 8.0;
	
	public Van() {
		
	}

	public Van(String placa, String modelo, String cor, int ano, int capacidadePassageiros) {
		super(placa, modelo, cor, ano, capacidadePassageiros);
	}

	@Override
	public double calcularTarifa(double distancia) {
		return this.VALOR_BASE + distancia;
	}
	
	@Override
	public boolean veiculoCompativel(Veiculo veiculo) {
		return true;
	}
	
	
	
}
