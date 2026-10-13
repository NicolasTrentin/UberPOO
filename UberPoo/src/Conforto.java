
public class Conforto implements Categoria {
	
	private final double ACRESCIMO = 1.20;
	
	public Conforto() {
		
	}
	
	@Override
	public double calcularValor(double distancia, Veiculo veiculo) {
		
		return veiculo.calcularTarifa(distancia) * ACRESCIMO;
	}

	@Override
	public boolean veiculoCompativel(Veiculo veiculo) {
	    return veiculo instanceof Carro;
	}
	
	
}
