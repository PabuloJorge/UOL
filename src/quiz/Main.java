package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int acertos = 0, erros = 0;
		Scanner leia = new Scanner(System.in);

		ArrayList<Pergunta> perguntas = new ArrayList();
		perguntas.add(new Pergunta("Quanto é 4x4?", "16"));
		perguntas.add(new Pergunta("Com quantos anos morreu Albert Einstein?", "76"));

		System.out.println("Digite seu nome:");
		nome = leia.nextLine();

		for (int i = 0; i < perguntas.size(); i++) {
			System.out.println(perguntas.get(i).getEnunciado());
			System.out.println(perguntas.get(i).getResposta());
			String resposta = leia.nextLine();
			if (resposta.equals(perguntas.get(i).getResposta())) {
				System.out.println("PARABÉNS, VOCÊ ACERTOU :D");
				acertos++;
			} else {
				System.out.println("QUE PENA, A RESPOSTA ESTÁ ERRADA :/");
				erros++;
			}
			System.out.println("====================================================");
		}

		System.out.println("RESULTADO");
		System.out.println("Usuário: " + nome);
		System.out.println("Acertos: " + acertos);
		System.out.println("Erros: " + erros);

	}

}
