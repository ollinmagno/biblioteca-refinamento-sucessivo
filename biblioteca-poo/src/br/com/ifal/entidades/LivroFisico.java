package br.com.ifal.entidades;

public class LivroFisico extends Livro{
	private int quantidadePaginas;
	private double peso;
	
	public LivroFisico(String titulo, Autor autor, String isbn, int anoEdicao, String editora, int quantidadePaginas, double peso) {
		super(titulo, autor, isbn, anoEdicao, editora);
		this.quantidadePaginas = quantidadePaginas;
		this.peso = peso;
	}
	
	public int getQuantidadePaginas() {
		return quantidadePaginas;
	}

	public void setQuantidadePaginas(int quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}