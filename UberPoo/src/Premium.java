
public class Premium implements Categoria{
	
	private final double ACRESCIMO = 1.50;
	
	public Premium() {
		
	}
	
	@Override
	public double calcularValor(double distancia, Veiculo veiculo) {
		
		return veiculo.calcularTarifa(distancia) * ACRESCIMO;
	}

	@Override
	public boolean veiculoCompativel(Veiculo veiculo) {
	    return veiculo instanceof Carro || veiculo instanceof Van;
	}
}
