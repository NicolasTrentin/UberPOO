
public class Corrida {

	private static int proxId = 1;
	
	private int id;
	private String origem;
	private String destino;
	private double distancia;
	private String status;
	private double valorFinal;
	
	private Passageiro passageiro;
	private Motorista motorista;
	private FormaPagamento pagamento;
	private Avaliacao avaliacao;
	private Veiculo veiculo;
	private Categoria categoria;
	
	public Corrida() {
		this.id = proxId++;
	}

	public Corrida(String origem, String destino, double distancia, String status, double valorFinal, Motorista motorista, FormaPagamento pagamento, Avaliacao avaliacao, Veiculo veiculo, Categoria categoria, Passageiro passageiro) {
		this.id = proxId++;
		this.origem = origem;
		this.destino = destino;
		this.distancia = distancia;
		this.status = status;
		this.valorFinal = valorFinal;
		this.motorista = motorista;
		this.pagamento = pagamento;
		this.avaliacao = avaliacao;
		this.veiculo = veiculo;
		this.categoria = categoria;
		this.passageiro = passageiro;
	}
	
	//#CORRIDA-RECEM-SOLICITADA
	public Corrida(Passageiro passageiro, String origem, String destino, double distancia, Categoria categoria, FormaPagamento pagamento) {
		this.id = proxId++;
		this.passageiro = passageiro;
		this.origem = origem;
		this.destino = destino;
		this.distancia = distancia;
		this.categoria = categoria;
		this.pagamento = pagamento;
		this.status = "SOLICITADA";
		this.valorFinal = 0;
	}
	
	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	public FormaPagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(FormaPagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}

	public void aceitar(Motorista motorista) {
		
		if(this.getStatus().equals("SOLICITADA") && this.getCategoria().veiculoCompativel(motorista.getVeiculo()) && motorista.getDisponibilidade()) {
			
			this.setMotorista(motorista);
			this.motorista.setDisponibilidade(false);
			this.setVeiculo(motorista.getVeiculo());
			this.setStatus("ACEITA");
			
			this.setValorFinal(this.calcularValor());
			
		}else {
			System.out.println("A CORRIDA JÁ ESTÁ ACEITA OU O VEÍCULO É INCOMPÁTIVEL COM CATEGORIA.");
		}

	}
	
	public void iniciar() {
		
		if(this.getStatus().equals("ACEITA")) {
			this.setStatus("EM_ANDAMENTO");
		}else {
			System.out.println("A CORRIDA NÃO PODE SER INICIADO NESTE ESTADO: " + this.getStatus());
		}
		
	}
	
	public double finalizar() {
		if(this.getStatus().equals("EM_ANDAMENTO")) {
			this.setStatus("FINALIZADA");
			this.motorista.setDisponibilidade(true);
			return this.valorFinal;
		}else {
			System.out.println("A CORRIDA NÃO PODE SER FINALIZADA NESTE ESTADO: " + this.getStatus());
			return 0;
		}
	}
	
	public void cancelar() {
		if(this.getStatus().equals("SOLICITADA") || this.getStatus().equals("ACEITA")){
			this.setStatus("CANCELADA");
			
			if(this.motorista != null) {
				this.motorista.setDisponibilidade(true);
			}
			
		}else {
			System.out.println("A CORRIDA NÃO PODE SER CANCELADA NESTE ESTADO: " + this.getStatus());
		}
	}
	
	public double calcularValor() {
		return this.getPagamento().calcularTarifa(this.getCategoria().calcularValor(this.getDistancia(), this.getVeiculo()));
	}
	
	public boolean podeSerAvaliado() {
	    return this.status.equals("FINALIZADA") && this.avaliacao == null;
	}
	
	public boolean avaliar(Avaliacao avaliacao) {
	    if (!podeSerAvaliado()) {
	        System.out.println("CORRIDA NÃO PODE SER AVALIADA.");
	        return false;
	    }

	    if (avaliacao.getMotorista() != this.motorista) {
	        System.out.println("MOTORISTA NÃO CORRESPONDE À CORRIDA.");
	        return false;
	    }

	    this.avaliacao = avaliacao;
	    return true;
	}
	
	@Override
	public String toString() {
		return "Corrida " + "[" + String.format("%02d", this.id) + "]" + "\n"
				+ "ID :" + this.id + "\n" 
				+ "Origem: " + this.origem + "\n"
				+ "Destino: " + this.destino + "\n"
				+ "Motorista: " + (this.motorista == null ? "Ainda não atribuído" : this.motorista) + "\n"
				+ "Categoria: " + this.categoria + "\n"
				+ "Valor Final: R$ " + String.format("%.2f", this.valorFinal);
				
	}
}
