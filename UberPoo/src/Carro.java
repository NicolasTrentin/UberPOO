
public class Carro extends Veiculo implements IVeiculo {
	
	public Carro() {
		
	}

	public Carro(String placa, String modelo, String cor, int ano, int capacidadePassageiros) {
		super(placa, modelo, cor, ano, capacidadePassageiros);

	}

	@Override
	public double calculoTarifa(double distancia) {
		
		return 5 + distancia;
	}
	
	//5 é o valor base, pode ser implementado como uma variavel tarifa_base
}
