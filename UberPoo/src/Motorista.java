
public class Motorista extends Pessoa{
	private String cnh;
	private boolean disponibilidade;
	
	public Motorista() {
		super();
	}

	public Motorista(String nome, String cpf, String telefone, String cnh, boolean disp) {
		super(nome, cpf, telefone);
		this.cnh = cnh;
		this.disponibilidade = disp;
	}
	
	public boolean getDisponibilidade() {
		return this.disponibilidade;
	}
	
}
