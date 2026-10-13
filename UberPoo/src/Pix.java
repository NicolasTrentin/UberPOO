
public class Pix implements FormaPagamento{
	
	private final double DESCONTO = 0.10;
	
	@Override
	public double calcularTarifa(double valor) {
		return valor * (1 - DESCONTO);
	}
	
	@Override
	public void getDescricao() {
		System.out.println("Forma de pagamento no PIX, 10% de desconto");
	}
}
