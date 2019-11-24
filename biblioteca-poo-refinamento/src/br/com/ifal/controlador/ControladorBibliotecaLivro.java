package br.com.ifal.controlador;

import java.util.ArrayList;
import java.util.List;

import br.com.ifal.modelo.Livro;
import br.com.ifal.modelo.LivroFisico;

public class ControladorBibliotecaLivro {

	private List<LivroFisico> livrosFisico;

	public ControladorBibliotecaLivro() {
		livrosFisico = new ArrayList<>();
	}

	public void cadastrarLivro(LivroFisico livro) {
		livrosFisico.add(livro);
		System.out.println("Livro cadastrado");
	}

	public void pesquisarLivro(String titulo) {
		for (Livro livro : livrosFisico) {
			if (livro.getTitulo().equals(titulo)) {
				System.out.println("Titulo : " + livro.getTitulo());
				System.out.println("Autor : " + livro.getAutor().getNome());
				System.out.println("Editora : " + livro.getEditora());
				System.out.println("ISBN: " + livro.getIsbn());
				System.out.println("Ano de edicao: " + livro.getAnoEdicao());
			}else {
				System.out.println("Livro não encontrado.");
			}
		}
	}

	public void alterarLivro(String titulo, String novoTitulo) {
		for (int i = 0; i < livrosFisico.size(); i++) {
			if (livrosFisico.get(i).getTitulo().equalsIgnoreCase(titulo)) {
				livrosFisico.get(i).setTitulo(novoTitulo);
				System.out.println("Titulo alterado com sucesso ");

			} else {
				System.out.println("Erro ao inserir titulo");
			}
		}

	}

	public void deletarLivro(String titulo) {
		for (int i = 0; i < livrosFisico.size(); i++) {
			if (livrosFisico.get(i).getTitulo().equalsIgnoreCase(titulo)) {
				livrosFisico.remove(i);
				System.out.println("Livro deletado com sucesso!!!");
			} else {
				System.out.println("Erro ao deletar livro");
			}
		}

	}

}
