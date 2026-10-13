
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

	//#CADASTRAR
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
	
	//#AÇÕES_CORRIDA
	public Corrida solicitarCorrida(Passageiro passageiro, String origem, String destino, double distancia, Categoria categoria, FormaPagamento pagamento) {

	    int i;

	    for (i = 0; i < corridas.length; i++) {
	        if (corridas[i] == null) {
	            break;
	        }
	    }

	    if (i == corridas.length) {
	        System.out.println("ARRAY CHEIO, IMPOSSÍVEL ARMAZENAR CORRIDA.");
	        return null;
	    } else {
	        Corrida corrida = new Corrida(passageiro, origem, destino, distancia, categoria, pagamento);

	        corridas[i] = corrida;
	        
	        return corrida;
	    }
	}
	
	public void aceitarCorrida(int id, Motorista motorista) {
		
		   if (motorista == null) {
		        System.out.println("MOTORISTA INVÁLIDO!");
		        return;
		    }
		
		boolean encontrou = false;
		
	    for (int i = 0; i < corridas.length; i++) {

	        if (corridas[i] != null && corridas[i].getId() == id) {
	            corridas[i].aceitar(motorista);
	            encontrou = true;
	            break;
	        }

	    }
	    
	    if(!encontrou) {
	    	System.out.println("CORRIDA NÃO ENCONTRADA.");
	    }
	}
	
	public void finalizarCorrida(int id) {
		
		boolean encontrou = false;
		
		for(int i = 0; i < this.corridas.length; i++) {
			if(this.corridas[i] != null && this.corridas[i].getId() == id) {
				corridas[i].finalizar();
				encontrou = true;
				break;
			}
		}
		
	    if(!encontrou) {
	    	System.out.println("CORRIDA NÃO ENCONTRADA.");
	    }
		
	}
	
	public void cancelarCorrida(int id) {
		
		boolean encontrou = false;
		
		for(int i = 0; i < this.corridas.length; i++) {
			if(this.corridas[i] != null && this.corridas[i].getId() == id) {
				corridas[i].cancelar();
				encontrou = true;
				break;
			}
		}
		
	    if(!encontrou) {
	    	System.out.println("CORRIDA NÃO ENCONTRADA.");
	    }
	}
	
	//#LISTAGEM
	public void listarPassageiros() {
	    System.out.println("PASSAGEIROS CADASTRADOS:\n");

	    boolean encontrou = false;

	    for (int i = 0; i < passageiros.length; i++) {
	        if (passageiros[i] != null) {
	        	
	            System.out.println("[" + i + "] - " + passageiros[i].toString());
	            
	            encontrou = true;
	        }
	    }

	    if (!encontrou) {
	        System.out.println("NENHUM PASSAGEIRO ENCONTRADO.");
	        return;
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
	        	
	            System.out.println("[" + i + "] - " + motoristas[i].toString());
	            
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
	        	
	            System.out.println("[" + i + "]" + " - " + veiculos[i].toString());
	            
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
	        	
	            System.out.println(corridas[i].toString());
	           
	            encontrou = true;
	        }
	    }

	    if (!encontrou) {
	        System.out.println("NENHUMA CORRIDA ENCONTRADA.");
	    }
	}
	
	public Corrida getCorrida(int id) {
	    for (int i = 0; i < corridas.length; i++) {
	        if (corridas[i] != null && corridas[i].getId() == id) {
	            return corridas[i];
	        }
	    }
	    
	    return null;
	}
	
	//#AVALIAÇÃO
	public Avaliacao[] getAvaliacoes() {
	    Avaliacao[] avaliacoes = new Avaliacao[corridas.length];
	
	    for (int i = 0; i < corridas.length; i++) {
	        if (corridas[i] != null && corridas[i].getAvaliacao() != null) {
	            avaliacoes[i] = corridas[i].getAvaliacao();
	        }
	    }
	
	    return avaliacoes;
	}
	
	public void listarComentarios( Motorista m) {
		
		boolean possuiComentarios = false;
		
		Avaliacao[] a = this.getAvaliacoes();
		
		for (int i = 0; i < a.length; i++) {
		    if (a[i] != null && a[i].getMotorista() == m && a[i].getComentario() != null && !a[i].getComentario().isBlank()) {

		        System.out.println("["+ (i + 1) + "]" + "-" + a[i].getComentario() + "\n");
		        possuiComentarios = true;
		    }
		}
		
		if (!possuiComentarios) {
		    System.out.println("Nenhum comentário registrado.");
		}
	}

	public double calcularMediaAvaliacoes(Motorista motorista) {
	    return motorista.calcularMediaAvaliacoes(getAvaliacoes());
	}
}
