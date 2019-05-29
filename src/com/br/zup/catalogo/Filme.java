package com.br.zup.catalogo;

import java.util.ArrayList;
import java.util.List;

public class Filme extends Item {

	private String genero = "";
	private int duracao = 0;
	List<String> atores = new ArrayList<String>();

	
	public Filme(String nome, String categoria) {
		super();
	}

	public Filme(String nome, String categoria, String genero, int duracao, List<String> atores) {
		super(nome, categoria);
		this.genero = genero;
		this.duracao = duracao;
		this.atores = atores;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public List<String> getAtores() {
		return atores;
	}

	public void setAtores(List<String> atores) {
		this.atores = atores;
	}

	public String listaAtores() {
		atores.sort(null);

		String lista = "";

		for (int i = 0; i < atores.size(); i++) {
			lista += "\n" + atores.get(i);
		}

		return lista;
	}

	public String toString() {
		String modelo = "";

		modelo += "Titulo -> " + super.getNome() + "\n";
		modelo += "Genero ->" + this.getGenero() + "\n";
		modelo += "Categoria ->" + super.getCategoria() + "\n";
		modelo += "Duração ->" + this.getDuracao() + "\n";
		modelo += "****Atores****";
		modelo += listaAtores();

		return modelo;

	}

}
