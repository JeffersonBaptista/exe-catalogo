package com.br.zup.catalogo;

public class Livro extends Item {

	
	private String autor = "";
	private int paginas = 0;
	
	public Livro(String nome, String categoria, String autor, int paginas) {
		super(nome, categoria);
		this.autor = autor;
		this.paginas = paginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	public String toString() {
		String modelo = "";
		
		modelo += "\nTitulo -> "+ super.getNome();
		modelo += "\nAutor -> "+ this.getAutor();
		modelo += "\nCategoria -> "+ super.getCategoria();
		modelo += "\nPaginas -> "+ this.getPaginas()+"\n";
				
		
		return modelo;
	}
	
}
