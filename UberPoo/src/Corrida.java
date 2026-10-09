
public class Corrida {

	private int id;
	private String origem;
	private String destino;
	private double distancia;
	private boolean status;
	private double valorFinal;
	
	private Motorista motorista;
	private FormaPagamento pagamento;
	
	public Corrida() {
		
	}

	public Corrida(int id, String origem, String destino, double distancia, boolean status, double valorFinal, Motorista motorista, FormaPagamento pagamento) {
		super();
		this.id = id;
		this.origem = origem;
		this.destino = destino;
		this.distancia = distancia;
		this.status = status;
		this.valorFinal = valorFinal;
		this.motorista = motorista;
		this.pagamento = pagamento;
	}
	
	public void aceitar(Motorista motorista) {
		System.out.println("Corrida aceitada!");
	}
	
	public void iniciar() {
		System.out.println("Corrida iniciada!");
	}
	
	public double finalizar() {
		return this.valorFinal;
	}
	
	public void cancelar() {
		System.out.println("Viagem cancelada!");
	}
	
	public double calcularValor() {
		return 0;
	}
	
	public boolean podeSerAvaliado() {
		return true;
	}
}
