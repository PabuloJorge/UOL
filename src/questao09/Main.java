package questao09;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String nome;
		double salarioBruto, bonus, desconto, salarioLiquido;
		int qtdFuncionarios;
		Scanner leia = new Scanner(System.in);
		Scanner leia2 = new Scanner(System.in);
		ArrayList<Funcionario> funcionarios = new ArrayList();

		System.out.println("Quantos funcionários serão cadastrados?");
		qtdFuncionarios = leia.nextInt();

		for (int i = 0; i < qtdFuncionarios; i++) {
			bonus = 0;
			salarioBruto = 0;
			desconto = 0;
			salarioLiquido = 0;
			
			System.out.println("Nome:");
			nome = leia2.nextLine();

			System.out.println("Salário bruto:");
			salarioBruto = leia.nextDouble();

			if (salarioBruto <= 1000) {
				bonus = salarioBruto * 20 / 100;
				salarioLiquido = salarioBruto + bonus;
			} else if (salarioBruto <= 2000) {
				bonus = salarioBruto * 10 / 100;
				salarioLiquido = salarioBruto + bonus;
			} else {
				desconto = salarioBruto * 10 / 100;
				salarioLiquido = salarioBruto - desconto;
			}

			funcionarios.add(new Funcionario(nome, salarioBruto, bonus, desconto, salarioLiquido));

			System.out.println("################################");
		}

		for (int i = 0; i < funcionarios.size(); i++) {
			System.out.println(funcionarios.get(i).toString());
			System.out.println("================================");
		}
	}
}
