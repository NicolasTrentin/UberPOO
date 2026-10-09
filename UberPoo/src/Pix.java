
public class Pix implements FormaPagamento{
	
	@Override
	public double calcularTarifa(double valor) {
		return valor * 0.90;
	}
	
	@Override
	public void getDescricao() {
		System.out.println("Forma de pagamento no PIX, 10% de desconto");
	}
}
