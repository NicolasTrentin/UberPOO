
public class Moto extends Veiculo {
	
	public final double VALOR_BASE = 3.0;
	
	public Moto() {
		
	}

	public Moto(String placa, String modelo, String cor, int ano, int capacidadePassageiros) {
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
