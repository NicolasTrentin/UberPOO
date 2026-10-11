
public class Economica implements Categoria{
	
	private final double ACRESCIMO = 1;
	
	public Economica() {
		
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
