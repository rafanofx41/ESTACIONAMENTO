package estacionamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testador {

	public static void main(String[] args){
		Estacionamento estacionamento = new Estacionamento();
		
		Cliente cli1 = new Cliente("José", "081.242.542-34", "1242-2435");
		Cliente cli2 = new Cliente("Juliano", "263.153.241-48", "3353-2231");
		Cliente cli3 = new Cliente("Rafel", "123.653.254-32", "3385-1242");
		
		Veiculo fusca = new Carro("1200", "qre-1534", cli1);
		Veiculo fox = new Carro("street", "eri-1483", cli2);
		Veiculo cg = new Moto("titan", "jre-1274", cli2);
		Veiculo biz = new Moto("125", "sjw-1234", cli3);
		Veiculo hornet = new Moto("osds", "mfg-1632", cli2);
		Veiculo Ka = new Carro("gt-40", "aof-1834", cli1);
		Veiculo gol = new Carro("oloa", "vio-2734", cli3);
		
		try {
			estacionamento.adicionaVeiculo(fusca);
			estacionamento.adicionaVeiculo(fox);
			estacionamento.adicionaVeiculo(cg);
			estacionamento.adicionaVeiculo(biz);
			estacionamento.adicionaVeiculo(hornet);
			estacionamento.adicionaVeiculo(Ka);
			estacionamento.adicionaVeiculo(gol);
		} catch (Exception e) {
			System.out.println("O vetor está cheio");
			e.printStackTrace();
		}
		
		
		//System.out.println(estacionamento.removeVeiculo(fox));
		
				
		/*for(Veiculo e: estacionamento.listaOrdenadaVeiculos()){
			System.out.println(e);
		}*/	
		
	}
	
	
}

