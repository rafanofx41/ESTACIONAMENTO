package estacionamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Estacionamento {

	private Veiculo[][] vaga = new Veiculo[60][2];

	public void setVaga(Veiculo[][] vaga) {
		this.vaga = vaga;
	}

	public Veiculo[][] getVaga() {
		return vaga;
	}

	public void adicionaVeiculo(Veiculo veiculo) throws Exception {
		veiculo.adicionaVeiculo(veiculo, this);
	}

	public int removeVeiculo(Veiculo veiculo) {
		return veiculo.removeVeiculo(veiculo, this);
	}

	
	public ArrayList<Veiculo> listaOrdenadaVeiculos() {
		ArrayList<Veiculo> lista = new ArrayList<>();
		for (int i = 0; i < 60; i++) {
			for (int j = 0; j < 2; j++) {
				if (vaga[i][j] != null) {
					lista.add(vaga[i][j]);
				}
			}
		}
		Collections.sort(lista);
		return lista;
	}


}