package questao08;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String login, senha;
		boolean loginEfetuado = false;
		Scanner leia = new Scanner(System.in);
		ArrayList<Usuario> usuarios = new ArrayList();
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);

		usuarios.add(new Usuario("usuario1", "Usuario1"));
		usuarios.add(new Usuario("usuario2", "Usuario2"));

		while (true) {
			System.out.println("Login:");
			login = leia.nextLine();
			System.out.println("Senha:");
			senha = leia.nextLine();

			for (int i = 0; i < usuarios.size(); i++) {
				if (login.equals(usuarios.get(i).getLogin()) && senha.equals(usuarios.get(i).getSenha())) {
					loginEfetuado = true;
					break;
				}
			}

			if (loginEfetuado) {
				if (hora < 6) {
					System.out.println("Boa madrugada, você se logou ao nosso sistema.");
				} else if (hora < 12) {
					System.out.println("Bom dia, você se logou ao nosso sistema.");
				} else if (hora < 18) {
					System.out.println("Boa tarde, você se logou ao nosso sistema.");
				} else {
					System.out.println("Boa noite, você se logou ao nosso sistema.");
				}
				break;
			} else {
				System.out.println("Usuário e/ou senha incorretos.");
			}

			System.out.println("===============================================");
		}
	}

}
