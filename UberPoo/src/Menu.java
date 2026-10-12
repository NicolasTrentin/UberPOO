import java.util.Scanner;

public class Menu {
	
	private static Scanner sc;
	private SistemaTransporte sistema;
	
	public Menu() {
		this.sistema = new SistemaTransporte();
	}
	
	public void mostrarMenu() {

		int opcao = 0;
		sc = new Scanner(System.in);

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
				//corridas();
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
	
	public void menuCadastros() {
		
		int opcao = 0;
		sc = new Scanner(System.in);
		
		do {
			System.out.println("=========================================");
			System.out.println("\tSISTEMA DE TRANSPORTE - CADASTROS");
			System.out.println("=========================================");
			System.out.println(" 1 - CADASTRAR PASSAGEIRO");
			System.out.println(" 2 - CADASTRAR MOTORISTA");
			System.out.println(" 3 - CADASTRAR VEÍCULO");
			System.out.println(" 0 - SAIR ");
			
			opcao = sc.nextInt();
			
			sc.nextLine();
			
			switch (opcao) {
			case 1:
				cadastrarPassageiro();
				break;
			case 2:
				cadastrarMotorista();
				break;
			case 3:
				//cadastrarVeiculo();
				break;
			case 0:
				System.out.println("Saindo...");
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
		String nome = sc.next();
		System.out.println("CPF:\n");
		String cpf = sc.next();
		System.out.println("TELEFONE:\n");
		String telefone = sc.next();
		
		p = new Passageiro(nome, cpf, telefone);
		
		sistema.cadastrarPassageiro(p);
	}
	
	public void cadastrarMotorista() {
		System.out.println("Digite as seguintes informações do passageiro:\n");
		
		Passageiro p;
		
		System.out.println("NOME:\n");
		String nome = sc.next();
		System.out.println("CPF:\n");
		String cpf = sc.next();
		System.out.println("TELEFONE:\n");
		String telefone = sc.next();
		System.out.println("CNH:\n");
		String cnh = sc.next();
		System.out.println("VEICULO:\n");
		//metodo para listar veiculos criados, para o usuario selecionar.

		
		p = new Passageiro(nome, cpf, telefone);
		
		sistema.cadastrarPassageiro(p);
	}
}
