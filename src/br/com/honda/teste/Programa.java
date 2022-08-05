package br.com.honda.teste;

import br.com.honda.beans.Carro;

public class Programa {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.setNome("Civic");
		
		carro.setCapacidadeCombustivel(5500);
		
		carro.setQuantidadeJanelas(6);
		
		carro.setQuantidadeRodas(4);
		
		System.out.println("O carro é um : " + carro.getNome() + ("\nCombustivel : " + carro.getCapacidadeCombustivel() + ("\nQtd de Janelas : ") + carro.getQuantidadeJanelas() + "\nRodas : " + carro.getQuantidadeRodas()));

	}

}
