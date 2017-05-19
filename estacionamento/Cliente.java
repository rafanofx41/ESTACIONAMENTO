package estacionamento;

public class Cliente {
	String nome;
	String cpf;
	String telefone;
	
	
	public Cliente(String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}


	@Override
	public String toString() {
		return nome;
	}
	
	
}
