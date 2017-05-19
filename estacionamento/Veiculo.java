package estacionamento;

public abstract class Veiculo  implements Comparable<Veiculo>{
	protected Cliente cliente;
	protected String placa;
	protected String modelo;
		
	public Veiculo(String modelo, String placa, Cliente cliente) {
		this.cliente = cliente;
		this.placa = placa;
		this.modelo = modelo;
	}

	public abstract boolean verificaVagas(Estacionamento estacionamento);
	public abstract void adicionaVeiculo(Veiculo veiculo, Estacionamento estacionamento) throws Exception;
	public abstract int calculaConta();
	public abstract int removeVeiculo(Veiculo veiculo, Estacionamento estacionamento);
	
	public Cliente getCliente() {
		return cliente;
	}


	public String getModelo() {
		return modelo;
	}


	public String getPlaca() {
		return placa;
	}
	
	@Override
	public String toString() {
		return "Cliente = " + cliente + ", Placa =m" + placa + ", Modelo = " + modelo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}
	
	public int compareTo(Veiculo veiculo){
		return this.getPlaca().substring(4).compareTo(veiculo.getPlaca().substring(4));
	}
	

	
}
