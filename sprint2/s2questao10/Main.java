package s2questao10;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o nome do funcionário:");
		String nome = leia.nextLine();
		System.out.println("Digite a frase:");
		String frase = leia.nextLine();
		String sentimento = "";
		if (contador(frase, ":-)") > contador(frase, ":-(")) {
			sentimento = "Divertido";
			System.out.println("Divertido");
		} else if (contador(frase, ":-)") < contador(frase, ":-(")) {
			sentimento = "Chateado";
			System.out.println("Chateado");
		} else {
			sentimento = "Neutro";
			System.out.println("Neutro");
		}

		try (Connection connection = new ConnectionFactory().getConnection()) {
			ClienteDAO clienteDao = new ClienteDAO(connection);
			clienteDao.salvar(new Cliente(nome, sentimento));

		}

	}

	public static int contador(String frase, String busca) {
		int index = 0;
		int cont = 0;
		while (true) {
			if (frase.indexOf(busca, index) != -1) {
				cont++;
				index = frase.indexOf(busca, index) + 2;
			} else {
				break;
			}
		}
		return cont;
	}

}
