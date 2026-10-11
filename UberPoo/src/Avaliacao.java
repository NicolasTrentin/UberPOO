
public class Avaliacao {
	private int nota;
	private String comentario;
	
	private Motorista motorista;
	
	public Avaliacao() {
		
	}

	public Avaliacao(int nota, String comentario, Motorista motorista) {
		super();
		this.nota = nota;
		this.comentario = comentario;
		this.motorista = motorista;
	}

	public int getNota() {
		return nota;
	}
	
	
	
	
}
