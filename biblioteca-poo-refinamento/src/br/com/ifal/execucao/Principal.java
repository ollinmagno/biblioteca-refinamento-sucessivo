package br.com.ifal.execucao;
import br.com.ifal.controlador.ControladorMenu;

public class Principal {
	public static void main(String[] args) {

		ControladorMenu ControladorMenu = new ControladorMenu();
		int opcao;
		do {
			opcao = ControladorMenu.exibirMenuGeral();
			switch (opcao) {
			case 1:
				ControladorMenu.exibirMenuAdicionarLivro();
				break;
			case 2:
				ControladorMenu.exibirMenuPesquisarLivro();
				break;
			case 3:
				ControladorMenu.exibirMenuAlterarDadosDoLivro();
				break;
			case 4:
				ControladorMenu.exibirMenuDeletarLivro();
				break;
			}

		} while (opcao != 0);
	}
}