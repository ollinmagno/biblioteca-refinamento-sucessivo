package br.com.ifal.modelo;

public class Ebook extends Livro {
	
	private String formato;
	private boolean marcaDagua;
	
	public Ebook(String titulo, Autor autor, String isbn, int anoEdicao, String editora, String formato, boolean marcaDagua) {
		super(titulo, autor, isbn, anoEdicao, editora);
		this.formato = formato;
		this.marcaDagua = marcaDagua;
	}
	
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}

	public boolean isMarcaDagua() {
		return marcaDagua;
	}

	public void setMarcaDagua(boolean marcaDagua) {
		this.marcaDagua = marcaDagua;
	}
	
	
	
}