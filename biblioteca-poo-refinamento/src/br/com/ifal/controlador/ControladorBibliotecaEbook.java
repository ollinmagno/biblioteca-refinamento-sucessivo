package br.com.ifal.controlador;

import java.util.ArrayList;
import java.util.List;

import br.com.ifal.modelo.Ebook;
import br.com.ifal.modelo.Livro;

public class ControladorBibliotecaEbook {

	private List<Ebook> ebooks;

	public ControladorBibliotecaEbook() {
		ebooks = new ArrayList<>();
	}

	public void cadastrarEbook(Ebook ebook) {
		ebooks.add(ebook);
		System.out.println("Ebook cadastrado");
	}

	public void pesquisarEbook(String titulo) {
		for (Livro ebook : ebooks) {
			if (ebook.getTitulo().equals(titulo)) {
				System.out.println("Titulo : " + ebook.getTitulo());
				System.out.println("Autor : " + ebook.getAutor().getNome());
				System.out.println("Editora : " + ebook.getEditora());
				System.out.println("ISBN: " + ebook.getIsbn());
				System.out.println("Ano de edicao: " + ebook.getAnoEdicao());
			}else {
				System.out.println("Ebook não encontrado.");
			}
		}
	}

	public void alterarEbook(String titulo, String novoTitulo) {
		for (int i = 0; i < ebooks.size(); i++) {
			if (ebooks.get(i).getTitulo().equalsIgnoreCase(titulo)) {
				ebooks.get(i).setTitulo(novoTitulo);
				System.out.println("Titulo alterado com sucesso ");
			} else {
				System.out.println("Erro ao inserir titulo");
			}
		}

	}

	public void deletarEbook(String titulo) {
		for (int i = 0; i < ebooks.size(); i++) {
			if (ebooks.get(i).getTitulo().equalsIgnoreCase(titulo)) {
				ebooks.remove(i);
				System.out.println("Ebook deletado com sucesso!!!");
			} else {
				System.out.println("Erro ao deletar ebook");
			}
		}

	}

}

