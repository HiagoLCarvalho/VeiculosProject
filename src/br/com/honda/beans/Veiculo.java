package br.com.honda.beans;

public class Veiculo {
	
	private String Nome;
	private int quantidadeRodas;
	private double capacidadeCombustivel = 44.300;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}
	public void setQuantidadeRodas(int quantidadeRodas) {
		this.quantidadeRodas = quantidadeRodas;
	}
	public double getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}
	public void setCapacidadeCombustivel(double capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}

}
