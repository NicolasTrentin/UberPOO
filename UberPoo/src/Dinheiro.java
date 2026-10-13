
public class Dinheiro implements FormaPagamento{
	
	private final double DESCONTO = 0.15;
	
	@Override
	public double calcularTarifa(double valor) {
		return valor * (1 - DESCONTO);
	}
	
	@Override
	public void getDescricao() {
		System.out.println("Forma de pagamento no Dinheiro, 15% de desconto");
	}
}
