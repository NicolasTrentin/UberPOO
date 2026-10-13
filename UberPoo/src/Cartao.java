
public class Cartao implements FormaPagamento{

	private final double DESCONTO = 1;
	
	@Override
	public double calcularTarifa(double valor) {
		return valor * DESCONTO;
	}
	
	@Override
	public void getDescricao() {
		System.out.println("Forma de pagamento no  Cartão, 5% de desconto");
	}
}
