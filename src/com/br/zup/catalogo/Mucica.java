package com.br.zup.catalogo;

public class Mucica extends Item {

	private String cantor;
	private String banda;
	private String genero;

	public Mucica(String nome, String categoria, String cantor, String banda, String genero) {
		super(nome, categoria);
		this.cantor = cantor;
		this.banda = banda;
		this.genero = genero;
	}

	public String getCantor() {
		return cantor;
	}

	public void setCantor(String cantor) {
		this.cantor = cantor;
	}

	public String getBanda() {
		return banda;
	}

	public void setBanda(String banda) {
		this.banda = banda;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String toString() {
		String modelo = "";

		modelo += "\nMusica -> " + super.getNome();
		modelo += "\nCantor -> " + this.getCantor();
		modelo += "\nBanda -> " + this.getBanda();
		modelo += "\nGenero ->" + this.getGenero();
		modelo += "\nCategoria ->" + super.getCategoria() + "\n";

		return modelo;

	}

}
