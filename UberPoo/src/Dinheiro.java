
public class Dinheiro implements FormaPagamento{
	
	@Override
	public double calcularTarifa(double valor) {
		return valor * 0.75;
	}
	
	@Override
	public void getDescricao() {
		System.out.println("Forma de pagamento no Dinheiro, 15% de desconto");
	}
}
