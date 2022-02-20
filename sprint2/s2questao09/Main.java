package s2questao09;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		try (Connection connection = new ConnectionFactory().getConnection()) {
			while (true) {
				mostraMenu();
				int opcao = Integer.parseInt(leia.nextLine());
				while (opcao > 6 || opcao < 1) {
					System.out.println(">>>>>>>>>> Opção inválida! Escolha novamente. <<<<<<<<<<<");
					mostraMenu();
					opcao = Integer.parseInt(leia.nextLine());
				}
				if (opcao == 1) {
					ProdutoDAO produtoDao = new ProdutoDAO(connection);
					produtoDao.salvar(new Produto("Notebook", "DELL", 30));
					produtoDao.salvar(new Produto("Teclado", "gamer razer", 15));
					produtoDao.salvar(new Produto("Mouse", "gamer razer", 10));
				} else if (opcao == 2) {
					ProdutoDAO produtoDao = new ProdutoDAO(connection);
					System.out.println("Digite o ID da oferta:");
					int id = Integer.parseInt(leia.nextLine());
					System.out.println("Qual o novo valor de desconto?");
					double desconto = Float.parseFloat(leia.nextLine());
					produtoDao.atualizar(id, desconto);
				} else if (opcao == 3) {
					ProdutoDAO produtoDao = new ProdutoDAO(connection);
					System.out.println("Digite o ID da oferta:");
					int id = Integer.parseInt(leia.nextLine());
					produtoDao.excluir(id);

				} else if (opcao == 4) {
					ProdutoDAO produtoDao = new ProdutoDAO(connection);
					System.out.println("Digite algo:");
					String[] frase = leia.nextLine().split(" ");
					List<Produto> listaDeProdutos = produtoDao.buscar(frase);
					listaDeProdutos.stream().forEach(lp -> System.out.println(lp));
				} else if (opcao == 5) {
					ProdutoDAO produtoDao = new ProdutoDAO(connection);
					List<Produto> listaDeProdutos = produtoDao.listar();
					listaDeProdutos.stream().forEach(lp -> System.out.println(lp));
				} else {
					break;
				}
			}
		}
	}

	public static void mostraMenu() {
		System.out.println("===============System===============");
		System.out.println("Digite a opção desejada para ofertas:");
		System.out.println("1 - Inserir");
		System.out.println("2 - Atualizar desconto");
		System.out.println("3 - Deletar");
		System.out.println("4 - Buscar");
		System.out.println("5 - Listar");
		System.out.println("6 - Sair");
	}
}
