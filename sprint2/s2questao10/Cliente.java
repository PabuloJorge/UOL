package s2questao10;


/*create table cliente(
id int primary key auto_increment,
nome varchar(100),
sentimento varchar(15)
);*/
public class Cliente {
	private int id;
	private String nome;
	private String sentimento;

	public Cliente(int id, String nome, String sentimento) {
		this.id = id;
		this.nome = nome;
		this.sentimento = sentimento;
	}

	public Cliente(String nome, String sentimento) {
		this.nome = nome;
		this.sentimento = sentimento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSentimento() {
		return sentimento;
	}

	public void setSentimento(String sentimento) {
		this.sentimento = sentimento;
	}

}
