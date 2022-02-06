package questao09;

public class Funcionario {
	private String nome;
	private double salarioBruto;

	public Funcionario(String nome, double salarioBruto) {
		this.nome = nome;
		this.salarioBruto = salarioBruto;
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
		if (this.salarioBruto <= 1000) {
			return salarioBruto * 0.2;
		} else if (salarioBruto <= 2000) {
			return salarioBruto * 0.1;
		} else {
			return 0;
		}

	}

	public double getDesconto() {
		if (this.salarioBruto > 2000) {
			return (this.salarioBruto * 0.1);
		} else {
			return 0;
		}
	}

	public double getSalarioLiquido() {
		if (this.salarioBruto > 2000) {
			return this.salarioBruto - getDesconto();
		} else {
			return this.salarioBruto + getBonus();
		}
	}

}
