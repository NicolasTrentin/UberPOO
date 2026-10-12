
public class SistemaTransporte {

	private final int QUANTIDADE_MAX = 100;
	
	private Motorista[] motoristas;
	private Passageiro[] passageiros;
	private Corrida[] corridas;
	private Veiculo[] veiculos;
	
	public SistemaTransporte() {
		this.motoristas = new Motorista[QUANTIDADE_MAX];
		this.passageiros = new Passageiro[QUANTIDADE_MAX];
		this.corridas = new Corrida[QUANTIDADE_MAX];
		this.veiculos = new Veiculo [QUANTIDADE_MAX];
	}
	
	public SistemaTransporte(Motorista[] motoristas, Passageiro[] passageiros, Corrida[] corridas, Veiculo[] veiculos) {
		this.motoristas = motoristas;
		this.passageiros = passageiros;
		this.corridas = corridas;
		this.veiculos = veiculos;
	}

	public void cadastrarPassageiro(Passageiro passageiro) {
		for(int i = 0; i < passageiros.length; i++) {
			if(passageiros[i] == null) {
				passageiros[i] = passageiro;
				break;
			}
		}
	}
	
	public void cadastrarMotorista(Motorista motorista) {
		for(int i = 0; i < motoristas.length; i++) {
			if(motoristas[i] == null) {
				motoristas[i] = motorista;
				break;
			}
		}
	}
	
	public void cadastrarVeiculo(Veiculo veiculo) {
		for(int i = 0; i < veiculos.length; i++) {
			if(veiculos[i] == null) {
				veiculos[i] = veiculo;
				break;
			}
		}
	}
	
	public void solicitarCorrida(Corrida corrida) {
		for(int i = 0; i < corridas.length; i++) {
			if(corridas[i] == null) {
				corridas[i] = corrida;
				break;
			}
		}
	}
	
	public void aceitarCorrida(int id, Motorista motorista) {
		
	}
	
	public void listarCorridas() {
		System.out.println("Corridas realizadas:\n");
		for(int i = 0; i < corridas.length; i++) {
			
			System.out.println(corridas[i].toString());
		}
	}
	
	public void listarVeiculos() {
		System.out.println("Véiculos Disponíveis:\n");
		for(int i = 0; i < veiculos.length; i++) {
			
			System.out.println(corridas[i].toString());
		}
	}
}
