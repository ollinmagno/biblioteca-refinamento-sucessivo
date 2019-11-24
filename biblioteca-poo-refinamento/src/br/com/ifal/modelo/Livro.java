package br.com.ifal.modelo;

public abstract class Livro {
	protected String titulo;
	protected Autor autor;
	protected String isbn;
	protected int anoEdicao;
	protected String editora;
	
	public Livro(String titulo, Autor autor, String isbn, int anoEdicao, String editora) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.anoEdicao = anoEdicao;
		this.editora = editora;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAnoEdicao() {
		return anoEdicao;
	}

	public void setAnoEdicao(int anoEdicao) {
		this.anoEdicao = anoEdicao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
}