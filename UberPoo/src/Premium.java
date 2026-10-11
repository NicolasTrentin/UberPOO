
public class Premium implements Categoria{
	
	private final double ACRESCIMO = 1.50;
	
	public Premium() {
		
	}
	
	@Override
	public double calcularValor(double valor, Veiculo veiculo) {
		
		return valor * ACRESCIMO;
	}

	@Override
	public boolean veiculoCompativel(Veiculo veiculo) {
		
		return false;
	}
}
