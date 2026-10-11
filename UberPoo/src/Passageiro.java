
public class Passageiro extends Pessoa{
	
	private final int LIMITE_CORRIDAS = 100;
	
	private Corrida[] corridas;
	
	public Passageiro(){
		this.corridas = new Corrida[LIMITE_CORRIDAS];
	}

	public Passageiro(String nome, String cpf, String telefone) {
		super(nome, cpf, telefone);
		this.corridas = new Corrida[LIMITE_CORRIDAS];

	}
	
	public void solicitarCorrida() {
		
	}
	
	public Avaliacao avaliarMotorista(Corrida corrida, int nota, String comentario) {
		
		Avaliacao avaliacao = new Avaliacao(nota, comentario, corrida.getMotorista());
		
		return avaliacao;
	}
	
}
