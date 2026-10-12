
public abstract class Veiculo {
	
	private String placa;
	private String modelo;
	private String cor;
	private int ano;
	private int capacidadePassageiros; //tinha que ser constante
	
	public Veiculo() {
		
	}

	public Veiculo(String placa, String modelo, String cor, int ano, int capacidadePassageiros) {
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.capacidadePassageiros = capacidadePassageiros;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getCapacidadePassageiros() {
		return capacidadePassageiros;
	}

	public void setCapacidadePassageiros(int capacidadePassageiros) {
		this.capacidadePassageiros = capacidadePassageiros;
	}
	
	public abstract double calcularTarifa(double distancia);
	
	public abstract boolean veiculoCompativel(Veiculo veiculo);
	
	@Override
	public String toString() {
		return "Veículo:\n"
				+ "Placa: " + this.placa + "\n"
				+ "Modelo: " + this.modelo + "\n"
				+ "Cor: " + this.cor + "\n"
				+ "Ano: " + this.ano + "\n";
				
	}
	
}
