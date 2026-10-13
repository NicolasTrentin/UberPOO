
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
	
//	public void listarCorridas() {
//		System.out.println("Corridas realizadas:\n");
//		for(int i = 0; i < corridas.length; i++) {
//			
//			System.out.println(corridas[i].toString());
//		}
//	}
	
	public void listarPassageiros() {
	    System.out.println("PASSAGEIROS CADASTRADOS:\n");

	    boolean encontrou = false;

	    for (int i = 0; i < passageiros.length; i++) {
	        if (passageiros[i] != null) {
	            System.out.println(
	                "[" + i + "] - " + passageiros[i].toString()
	            );
	            
	            encontrou = true;
	        }
	    }

	    if (!encontrou) {
	        System.out.println("NENHUM PASSAGEIRO ENCONTRADO.");
	    }
	}
	
	public Passageiro getPassageiro(int indice) {
	    if (indice >= 0 && indice < passageiros.length) {
	        return passageiros[indice];
	    }
	    
	    System.out.println("ÍNDICE INVÁLIDO.");
	    return null;
	}
	
	public void listarMotoristas() {
	    System.out.println("MOTORISTAS CADASTRADOS:\n");

	    boolean encontrou = false;

	    for (int i = 0; i < motoristas.length; i++) {
	        if (motoristas[i] != null) {
	            System.out.println(
	                "[" + i + "] - " + motoristas[i].toString()
	            );
	            
	            encontrou = true;
	        }
	    }

	    if (!encontrou) {
	        System.out.println("NENHUM MOTORISTA ENCONTRADO.");
	    }
	}
	
	public Motorista getMotorista(int indice) {
	    if (indice >= 0 && indice < motoristas.length) {
	        return motoristas[indice];
	    }
	    
	    System.out.println("ÍNDICE INVÁLIDO.");
	    return null;
	}
	
	public void listarVeiculos() {
	    System.out.println("VEÍCULOS CADASTRADOS:\n");

	    boolean encontrou = false;

	    for (int i = 0; i < veiculos.length; i++) {
	        if (veiculos[i] != null) {
	        	
	            System.out.println("[" + i + "]" + " - " + veiculos[i].toString()
	            		
	            );
	            
	            encontrou = true;
	        }
	    }

	    if (!encontrou) {
	        System.out.println("NENHUM VEÍCULO ENCONTRADO.");
	    }
	}
	
	public Veiculo getVeiculo(int indice) {
		
		if(indice >= 0 && indice <= this.veiculos.length) {
			return veiculos[indice];
		}
		
		System.out.println("ÍNDICE INVÁLIDO.");
		return null;
	}
	
	public void listarCorridas() {
	    System.out.println("CORRIDAS REGISTRADAS:\n");

	    boolean encontrou = false;

	    for (int i = 0; i < corridas.length; i++) {
	        if (corridas[i] != null) {
	            System.out.println(
	                 corridas[i].toString()
	            );
	            
	            encontrou = true;
	        }
	    }

	    if (!encontrou) {
	        System.out.println("NENHUMa CORRIDA ENCONTRADO.");
	    }
	}
}
