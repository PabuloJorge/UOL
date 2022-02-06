package questao09;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leia2 = new Scanner(System.in);

		ArrayList<Funcionario> funcionarios = new ArrayList();

		System.out.println("Quantos funcionários serão cadastrados?");
		int qtdFuncionarios = leia.nextInt();

		for (int i = 0; i < qtdFuncionarios; i++) {

			System.out.println("Nome:");
			String nome = leia2.nextLine();

			System.out.println("Salário bruto:");
			double salarioBruto = leia.nextDouble();

			funcionarios.add(new Funcionario(nome, salarioBruto));

			System.out.println("################################");
		}

		for (int i = 0; i < funcionarios.size(); i++) {
			if (funcionarios.get(i).getSalarioBruto() <= 2000) {
				System.out.printf("Funcionário: %s %nSalário: %.2f %nBônus: %.2f %nSalário Líquido: %.2f%n",
						funcionarios.get(i).getNome(), funcionarios.get(i).getSalarioBruto(),
						funcionarios.get(i).getBonus(), funcionarios.get(i).getSalarioLiquido());
			} else {
				System.out.printf("Funcionário: %s %nSalário: %.2f %nDesconto: %.2f %nSalário Líquido: %.2f%n",
						funcionarios.get(i).getNome(), funcionarios.get(i).getSalarioBruto(),
						funcionarios.get(i).getDesconto(), funcionarios.get(i).getSalarioLiquido());
			}
			System.out.println("================================");
		}
	}
}
