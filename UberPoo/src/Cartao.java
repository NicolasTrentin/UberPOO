
public class Cartao implements FormaPagamento{

	@Override
	public double calcularTarifa(double valor) {
		return valor * 0.95;
	}
	
	@Override
	public void getDescricao() {
		System.out.println("Forma de pagamento no  Cartão, 5% de desconto");
	}
}
