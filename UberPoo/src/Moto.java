
public class Moto extends Veiculo {
	
	private final double VALOR_BASE = 3.0;
	private final int CAPACIDADE_PASSAGEIROS = 1; 
	
	public Moto() {
		
	}
	
	public Moto(String placa, String modelo, String cor, int ano) {
		super(placa, modelo, cor, ano);
	}

	public double getVALOR_BASE() {
		return VALOR_BASE;
	}

	public int getCAPACIDADE_PASSAGEIROS() {
		return CAPACIDADE_PASSAGEIROS;
	}
	
	@Override
	public double calcularTarifa(double distancia) {
		return this.VALOR_BASE + distancia;
	}
	
	@Override
	public boolean veiculoCompativel(Veiculo veiculo) {
		return true;
	}
	
	@Override
	public String toString() {
		return "Veículo: Moto\n"
				+ "Placa: " + this.getPlaca() + "\n"
				+ "Modelo: " + this.getModelo() + "\n"
				+ "Cor: " + this.getCor() + "\n"
				+ "Ano: " + this.getAno() + "\n"
				+ "Capacidade: " + this.getCAPACIDADE_PASSAGEIROS() + " passageiros.";		
	}
}
