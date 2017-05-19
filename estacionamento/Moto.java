package estacionamento;

import java.util.Date;

public class Moto extends Veiculo {
	private static int precoPrimeiraHora = 2;
	private static int precoHora = 2;
	private int horaEntrada;

	public Moto(String modelo, String placa, Cliente cliente) {
		super(placa, modelo, cliente);
		this.placa = placa;
		this.modelo = modelo;
		this.cliente = cliente;
	}

	@Override
	public boolean verificaVagas(Estacionamento estacionamento){
		for (int i = 0; i < 60; i++) {
			if(estacionamento.getVaga()[i][0] == null || estacionamento.getVaga()[i][1] == null){
				return  true;
			}
		}
		return false;
	}

	public void adicionaVeiculo(Veiculo veiculo, Estacionamento estacionamento) throws Exception {
		if(verificaVagas(estacionamento)){
			for (int i = 0; i < 60; i++) {
				if(estacionamento.getVaga()[i][0] == null){
					estacionamento.getVaga()[i][0] = veiculo;
					break;
				}else if(estacionamento.getVaga()[i][0].getClass() == this.getClass() && estacionamento.getVaga()[i][1] == null){
					estacionamento.getVaga()[i][1] = veiculo;
					break;
				}
			}
		}else{
			throw new EstacionamentoCheioException();
		}
		Date date = new Date();
		horaEntrada = date.getHours();
	}

	public int calculaConta() {
		int conta;
		int horaSaida;
		Date date = new Date();
		horaSaida = date.getHours();
		conta = (int) (precoPrimeiraHora + ((horaSaida - horaEntrada) - 1) * precoHora);
		if((horaSaida - horaEntrada) == 0){
			conta = 2;
		}
		return conta;
	}

	public int removeVeiculo(Veiculo veiculo, Estacionamento estacionamento) {
		int conta = calculaConta();
		for (int i = 0; i < 60; i++) {
			for (int j = 0; j < 2; j++) {
				if(veiculo.equals(estacionamento.getVaga()[i][j])){
					estacionamento.getVaga()[i][j] = null;
				}
			}
		}
		return conta;
	}
	
}
