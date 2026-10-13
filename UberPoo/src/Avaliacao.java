
public class Avaliacao {
	private int nota;
	private String comentario;
	
	private Motorista motorista;
	
	public Avaliacao() {
		
	}

	public Avaliacao(int nota, String comentario, Motorista motorista) {
	    if (nota < 1 || nota > 5) {
	        throw new IllegalArgumentException("A nota deve estar entre 1 e 5.");
	    }
	    this.nota = nota;
	    this.comentario = comentario;
	    this.motorista = motorista;
	}

	public int getNota() {
		return nota;
	}

	public Motorista getMotorista() {
		return motorista;
	}
	
	
	
}
