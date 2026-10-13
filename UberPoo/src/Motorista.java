
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
		this.disponibilidade = true;
		this.veiculo = veiculo;
	}
	
	public Motorista(String nome, String cpf, String telefone, String cnh, Veiculo veiculo) {
		super(nome, cpf, telefone);
		this.cnh = cnh;
		this.disponibilidade = true;
		this.veiculo = veiculo;
	}
	
	public boolean getDisponibilidade() {
		return this.disponibilidade;
	}
	
	
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public String getCnh() {
		return cnh;
	}

	public double calcularMediaAvaliacoes(Avaliacao[] avaliacoes) {
		
	    if (avaliacoes == null || avaliacoes.length == 0) {
	        return 0.0;
	    }
		
		double soma = 0.0;
		
		for(int i = 0; i < avaliacoes.length; i ++) {
			soma += avaliacoes[i].getNota();
		}
		
		return soma / avaliacoes.length;
	}
	
	public String toString() {
		return "Motorista - "+ "Nome: " + this.getNome() + " - " + "CNH: " + this.getCnh() + "\n";		
	}
	
}
