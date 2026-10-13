import java.util.Scanner;

public class Menu {
	
	private static Scanner sc;
	private SistemaTransporte sistema;
	
	public Menu() {
		this.sistema = new SistemaTransporte();
		sc = new Scanner(System.in);
	}
	
	public void mostrarMenu() {

		int opcao = 0;
		//sc = new Scanner(System.in);

		do {
			System.out.println("=========================================");
			System.out.println("\tSISTEMA DE TRANSPORTE");
			System.out.println("=========================================");
			System.out.println(" 1 - CADASTROS");
			System.out.println(" 2 - CORRIDAS");
			System.out.println(" 3 - CONSULTAS");
			System.out.println(" 0 - SAIR ");
			
			opcao = sc.nextInt();
			
			sc.nextLine();
			
			switch (opcao) {
			case 1:
				menuCadastros();
				break;
			case 2:
				menuCorridas();
				break;
			case 3:
				//consultas();
				break;
			case 0:
				System.out.println("Saindo...");
				System.exit(0);
			}
			
			System.out.println("=========================================");
			
		} while (opcao != 0);
		
		sc.close();
	}
	 
	//#CADASTROS
	public void menuCadastros() {
		
		int opcao = 0;
		//sc = new Scanner(System.in);
		
		do {
			System.out.println("=========================================");
			System.out.println("SISTEMA DE TRANSPORTE - CADASTROS");
			System.out.println("=========================================");
			System.out.println(" [1] - CADASTRAR PASSAGEIRO");
			System.out.println(" [2] - CADASTRAR VEÍCULO");
			System.out.println(" [3] - CADASTRAR MOTORISTA");
			System.out.println(" [0] - SAIR ");
			
			opcao = sc.nextInt();
			
			sc.nextLine();
			
			switch (opcao) {
			case 1:
				cadastrarPassageiro();
				break;
			case 2:
				cadastrarVeiculo();
				break;
			case 3:
				cadastrarMotorista();
				break;
			case 0:
				System.out.println("SAINDO...");
				System.exit(0);
			}
			
			System.out.println("=========================================");
			
		} while (opcao != 0);
		
		sc.close();
	}
	
	public void cadastrarPassageiro() {
		System.out.println("Digite as seguintes informações do passageiro:\n");
		
		Passageiro p;
		
		System.out.println("NOME:\n");
		String nome = sc.nextLine();
		System.out.println("CPF:\n");
		String cpf = sc.nextLine();
		System.out.println("TELEFONE:\n");
		String telefone = sc.nextLine();
		
		p = new Passageiro(nome, cpf, telefone);
		
		sistema.cadastrarPassageiro(p);
	}
	
	public void cadastrarMotorista() {
		System.out.println("Digite as seguintes informações do motorista:\n");
		
		Motorista m;
		
		System.out.println("NOME:\n");
		String nome = sc.nextLine();
		System.out.println("CPF:\n");
		String cpf = sc.nextLine();
		System.out.println("TELEFONE:\n");
		String telefone = sc.nextLine();
		System.out.println("CNH:\n");
		String cnh = sc.nextLine();
		System.out.println("VEICULO:\n");
		
		System.out.println("Digite o índice do veículo desejado:\n\n");
		
		sistema.listarVeiculos();
		
		int indice = sc.nextInt();
		sc.nextLine();
		
		m = new Motorista(nome, cpf, telefone, cnh, sistema.getVeiculo(indice));
		
		sistema.cadastrarMotorista(m);
	}
	
	public void cadastrarVeiculo() {
		System.out.println("Selecione o tipo de veiculo que deseja cadastrar:\n");
		System.out.println(" [1] - MOTO");
		System.out.println(" [2] - CARRO");
		System.out.println(" [3] - VAN");
		
		int opcao = 0;
		
		opcao = sc.nextInt();
		sc.nextLine();
		
		switch (opcao) {
		case 1:
			moto();
			break;
		case 2:
			carro();
			break;
		case 3:
			van();
			break;
		}
	
	}
	
	public void moto() {
		System.out.println("Digite as seguintes informações da moto:\n");
		
		Veiculo v;
		
		System.out.println("PLACA:\n");
		String placa = sc.nextLine();
		System.out.println("MODELO:\n");
		String modelo = sc.nextLine();
		System.out.println("COR:\n");
		String cor = sc.nextLine();
		System.out.println("ANO:\n");
		int ano = sc.nextInt();
		sc.nextLine();
		
		v = new Moto(placa, modelo, cor, ano);
		
		sistema.cadastrarVeiculo(v);
	} 
	
	public void carro() {
		System.out.println("Digite as seguintes informações do carro:\n");
		
		Veiculo v = null;
		
		System.out.println("PLACA:\n");
		String placa = sc.nextLine();
		System.out.println("MODELO:\n");
		String modelo = sc.nextLine();
		System.out.println("COR:\n");
		String cor = sc.nextLine();
		System.out.println("ANO:\n");
		int ano = sc.nextInt();
		sc.nextLine();
		
		v = new Carro(placa, modelo, cor, ano);
		
		sistema.cadastrarVeiculo(v);
	}
	
	public void van() {
		System.out.println("Digite as seguintes informações da van:\n");
		
		Veiculo v = null;
		
		System.out.println("PLACA:\n");
		String placa = sc.nextLine();
		System.out.println("MODELO:\n");
		String modelo = sc.nextLine();
		System.out.println("COR:\n");
		String cor = sc.nextLine();
		System.out.println("ANO:\n");
		int ano = sc.nextInt();
		sc.nextLine();
		
		v = new Van(placa, modelo, cor, ano);
		
		sistema.cadastrarVeiculo(v);
	}
	
	//#CORRIDAS
	public void menuCorridas() {
		
		int opcao = 0;
		//sc = new Scanner(System.in);
		
		do {
			System.out.println("=========================================");
			System.out.println("SISTEMA DE TRANSPORTE - CORRIDAS");
			System.out.println("=========================================");
			System.out.println(" [1] - SOLICITAR CORRIDA");
			System.out.println(" [2] - ACEITAR CORRIDA");
			System.out.println(" [3] - FINALIZAR CORRIDA");
			System.out.println(" [4] - CANCELAR CORRIDA");
			System.out.println(" [5] - AVALIAR MOTORISTA");
			System.out.println(" [0] - VOLTAR ");
			
			opcao = sc.nextInt();		
			sc.nextLine();
			
			switch (opcao) {
			case 1:
				solicitarCorrida();
				break;
			case 2:
				aceitarCorrida();
				break;
			case 3:
				finalizarCorrida();
				break;
			case 4:
				cancelarCorrida();
				break;
			case 5:
				avaliarMotorista();
				break;
			case 0:
				System.out.println("VOLTANDO...");
				mostrarMenu();
			}
			
			System.out.println("=========================================");
			
		} while (opcao != 0);
		
		sc.close();
	}
	
	public void solicitarCorrida() {
		int indice = 0;
		
		System.out.println("Digite o índice do passageiro desejado:\n\n");
		
		 Passageiro p = null;
		 
		sistema.listarPassageiros();
		 
		indice = sc.nextInt();
		sc.nextLine();

		p = sistema.getPassageiro(indice);
		
//		if (p == null) {
//		    System.out.println("PASSAGEIRO NÃO ENCONTRADO.");
//		    return;
//		}
		
		Corrida c = null;
		
		System.out.println("Digite as seguintes informações da corrida:\n");
		
		System.out.println("ENDEREÇO ORIGEM\n");
		String origem = sc.nextLine();
		System.out.println("ENDEREÇO DESTINO :\n");
		String destino = sc.nextLine();
		System.out.println("DISTÂNCIA:\n");
		double distancia = sc.nextDouble();
		
		System.out.println("Selecione a categoria da corrida solicitada:\n");
		
		Categoria cat = null;
		
		System.out.println(" [1] - ECONOMICA");
		System.out.println(" [2] - CONFORTO");
		System.out.println(" [3] - PREMIUM");
		
		int opcao = 0;
		
		opcao = sc.nextInt();
		sc.nextLine();
		
		switch (opcao) {
		case 1:
			cat = new Economica();
			break;
		case 2:
			cat = new Conforto();
			break;
		case 3:
			cat = new Premium();;
			break;
	    default:
	        System.out.println("CATEGORIA INVÁLIDA.");
	        return;
		}
		
		System.out.println("Selecione a forma de pagamento da corrida solicitada:\n");
		
		FormaPagamento pag = null;
		
		System.out.println(" [1] - DINHEIRO");
		System.out.println(" [2] - PIX");
		System.out.println(" [3] - CARTÃO");
		
		opcao = sc.nextInt();
		sc.nextLine();
		
		switch (opcao) {
		case 1:
			pag = new Dinheiro();
			break;
		case 2:
			pag = new Pix();
			break;
		case 3:
			pag = new Cartao();;
			break;
	    default:
	        System.out.println("FORMA DE PAGAMENTO INVÁLIDA.");
	        return;
		}
		
		c = sistema.solicitarCorrida(p, origem, destino, distancia, cat, pag);
		System.out.println("Corrida soliciada com sucesso:\n" + c.toString());
	}
	
	public void aceitarCorrida() {
	    System.out.println("Selecione o ID da corrida que deseja aceitar:\n");

	    sistema.listarCorridas();

	    int id = sc.nextInt();
	    sc.nextLine();

	    System.out.println("Selecione o motorista desejado:\n");

	    sistema.listarMotoristas();

	    int indice = sc.nextInt();
	    sc.nextLine();

	    Motorista m = sistema.getMotorista(indice);

//	    if (m == null) {
//	        System.out.println("MOTORISTA NÃO ENCONTRADO.");
//	        return;
//	    }

	    sistema.aceitarCorrida(id, m);
	}
	
	public void finalizarCorrida() {
	    System.out.println("Selecione o ID da corrida que deseja finalizar:\n");

	    sistema.listarCorridas();

	    int id = sc.nextInt();
	    sc.nextLine();
	    
		sistema.finalizarCorrida(id);
	}
	
	public void cancelarCorrida() {
	    System.out.println("Selecione o ID da corrida que deseja cancelar:\n");

	    sistema.listarCorridas();

	    int id = sc.nextInt();
	    sc.nextLine();
	    
		sistema.cancelarCorrida(id);
	}
	
	public void avaliarMotorista() {
	    System.out.println("Selecione o ID da corrida que deseja avaliar:\n");
	    Corrida c = null;

	    sistema.listarCorridas();
	    
	    int id = sc.nextInt();
	    sc.nextLine();
	    
	    c = sistema.getCorrida(id);
	    
	    if (c == null) {
	        System.out.println("CORRIDA NÃO ENCONTRADA.");
	        return;
	    }
	    
	    if (!c.podeSerAvaliado()) {
	        System.out.println("ESSA CORRIDA NÃO PODE SER AVALIADA.");
	        return;
	    }
	    
	    System.out.println("Digite a nota do motorista (1 a 5):");
	    int nota = sc.nextInt();
	    sc.nextLine();

	    System.out.println("Digite um comentário (ou pressione ENTER para pular):");
	    String comentario = sc.nextLine();
	    
	    Avaliacao a = new Avaliacao(nota, comentario, c.getMotorista());

	    if (c.avaliar(a)) {
	        System.out.println("AVALIAÇÃO REGISTRADA COM SUCESSO!");
	    }
	}
	
	//#CONSULTAS
	public void menuConsultas() {
		
		int opcao = 0;
		//sc = new Scanner(System.in);
		
		do {
			System.out.println("=========================================");
			System.out.println("SISTEMA DE TRANSPORTE - CADASTROS");
			System.out.println("=========================================");
			System.out.println(" [1] - LISTAR CORRIDAS");
			System.out.println(" [2] - CONSULTAR PASSAGEIRO");
			System.out.println(" [3] - CONSULTAR MOTORISTA");
			System.out.println(" [0] - SAIR ");
			
			opcao = sc.nextInt();
			
			sc.nextLine();
			
			switch (opcao) {
			case 1:
				sistema.listarCorridas();
				break;
			case 2:
				consultarPassageiro();
				break;
			case 3:
				consultarMotorista();
				break;
			case 0:
				System.out.println("SAINDO...");
				System.exit(0);
			}
			
			System.out.println("=========================================");
			
		} while (opcao != 0);
		
		sc.close();
	}


	public void consultarMotorista() {
	    System.out.println("Selecione o motorista desejado:\n");
	    Motorista m = null;
	    sistema.listarMotoristas();
	
	    int indice = sc.nextInt();
	    sc.nextLine();
	
	    m = sistema.getMotorista(indice);
	
	    if (m == null) {
	        System.out.println("MOTORISTA NÃO ENCONTRADO.");
	        return;
	    }
	    
	    System.out.println(m.toString());
	
	    double media = sistema.calcularMediaAvaliacoes(m);
	    
	    if (media == 0.0) {
	        System.out.println("MOTORISTA NÃO POSSUI AVALIAÇÕES");
	    } else {
	        System.out.println("Média das avaliações: " + String.format("%.2f", media));
	        sistema.listarComentarios(m);
	    }
	}
	
	public void consultarPassageiro() {
	    System.out.println("Selecione o passageiro desejado:\n");
	    Passageiro p = null;
	    sistema.listarPassageiros();
	
	    int indice = sc.nextInt();
	    sc.nextLine();
	
	    p = sistema.getPassageiro(indice);
	
	    if (p == null) {
	        System.out.println("PASSAGEIRO NÃO ENCONTRADO.");
	        return;
	    }
	    
	    System.out.println(p.toString());
	}
}
