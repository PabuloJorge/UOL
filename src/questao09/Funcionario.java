package questao09;

public class Funcionario {
	private String nome;
	private double salarioBruto;
	private double bonus;
	private double desconto;
	private double salarioLiquido;

	public Funcionario(String nome, double salarioBruto, double bonus, double desconto, double salarioLiquido) {
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.bonus = bonus;
		this.desconto = desconto;
		this.salarioLiquido = salarioLiquido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nSalário Bruto: " + salarioBruto + "\nBônus: " + bonus + "\nDesconto: " + desconto
				+ "\nSalário Líquido: " + salarioLiquido;
	}

}
