
public class Economica implements Categoria{
	
	private final double ACRESCIMO = 1;
	
	public Economica() {
		
	}
	
	@Override
	public double calcularValor(double distancia, Veiculo veiculo) {
		
		return veiculo.calcularTarifa(distancia) * ACRESCIMO;
	}

	@Override
	public boolean veiculoCompativel(Veiculo veiculo) {
	    return veiculo instanceof Moto || veiculo instanceof Carro;
	}
	
	@Override
	public String toString() {
		return "Economica - " + "Acrescimo: " + ((this.ACRESCIMO - 1) * 100)  + "%\n";		
	}
}
