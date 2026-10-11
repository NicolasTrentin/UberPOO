
public class Conforto implements Categoria {
	
	private final double ACRESCIMO = 1.20;
	
	public Conforto() {
		
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
