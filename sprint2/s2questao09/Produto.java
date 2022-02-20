package s2questao09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	double desconto;
	private Date dataInicio;

	public Produto(int id, String nome, String descricao, double desconto, Date dataInicio) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.desconto = desconto;
		this.dataInicio = dataInicio;
	}

	public Produto(String nome, String descricao, double desconto) {

		this.nome = nome;
		this.descricao = descricao;
		this.desconto = desconto;
	}

	public String getNome() {
		return nome;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		SimpleDateFormat formatdata = new SimpleDateFormat("dd/MM/yyyy");
		return String.format("%d - %s - %s - R$%.2f - %s", this.id, this.nome, this.descricao, this.desconto,
				formatdata.format(this.dataInicio));
	}
}
