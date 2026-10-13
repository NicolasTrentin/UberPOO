
public class Passageiro extends Pessoa{
	
	public Passageiro(){
	}

	public Passageiro(String nome, String cpf, String telefone) {
		super(nome, cpf, telefone);

	}
	
	public void solicitarCorrida() {
		
	}
	
	public Avaliacao avaliarMotorista(Corrida corrida, int nota, String comentario) {
		
		Avaliacao avaliacao = new Avaliacao(nota, comentario, corrida.getMotorista());
		
		return avaliacao;
	}
	
	@Override
	public String toString() {
		return "Passageiro:\n"
				+ "Nome: " + this.getNome() + "\n"
				+ "Cpf: " + this.getCpf() + "\n"
				+ "Telefone: " + this.getTelefone() + "\n";		
	}
}
