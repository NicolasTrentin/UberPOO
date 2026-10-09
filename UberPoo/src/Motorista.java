
public class Motorista extends Pessoa{
	
	private String cnh;
	private boolean disponibilidade;
	
	private Veiculo veiculo;
	
	public Motorista() {
		super();
	}

	public Motorista(String nome, String cpf, String telefone, String cnh, boolean disp, Veiculo veiculo) {
		super(nome, cpf, telefone);
		this.cnh = cnh;
		this.disponibilidade = disp;
		this.veiculo = veiculo;
	}
	
	public boolean getDisponibilidade() {
		return this.disponibilidade;
	}
	
	
	public String getCnh() {
		return cnh;
	}

	public double calcularMediaAvaliacoes() {
		return 0;
	}
	
}
