package s2questao09;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mchange.v2.sql.filter.SynchronizedFilterDataSource;

public class ProdutoDAO {

	private Connection connection;

	public ProdutoDAO(Connection connection) {
		this.connection = connection;
	}

	public void salvar(Produto produto) throws SQLException {
		String sql = "INSERT INTO PRODUTO (NOME, DESCRICAO, DESCONTO) VALUES (?, ?, ?)";

		try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

			pstm.setString(1, produto.getNome());
			pstm.setString(2, produto.getDescricao());
			pstm.setDouble(3, produto.getDesconto());

			pstm.execute();

		}
	}

	public List<Produto> listar() throws SQLException {
		List<Produto> produtos = new ArrayList<Produto>();

		String sql = "SELECT ID, NOME, DESCRICAO, DESCONTO, INICIO FROM PRODUTO";

		try (PreparedStatement pstm = connection.prepareStatement(sql)) {
			pstm.execute();

			try (ResultSet rst = pstm.getResultSet()) {
				while (rst.next()) {
					Produto produto = new Produto(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getDouble(4),
							rst.getDate(5));

					produtos.add(produto);
				}
			}
		}
		return produtos;
	}

	public void excluir(int id) throws SQLException {
		String sql = "DELETE FROM PRODUTO WHERE ID = ?";
		try (PreparedStatement pstm = connection.prepareStatement(sql)) {
			pstm.setDouble(1, id);
			pstm.execute();
		}
	}

	public void atualizar(int id, double desconto) throws SQLException {
		String sql = "UPDATE PRODUTO SET DESCONTO = ? WHERE ID = ?";
		try (PreparedStatement pstm = connection.prepareStatement(sql)) {
			pstm.setDouble(1, desconto);
			pstm.setInt(2, id);
			pstm.execute();
		}
	}

	public List<Produto> buscar(String[] texto) throws SQLException {
		List<Produto> produtos = new ArrayList<Produto>();
		String sql = "SELECT * FROM PRODUTO WHERE NOME LIKE ?";

		
		for (int i = 0; i < texto.length; i++) {
			try (PreparedStatement pstm = connection.prepareStatement(sql)) {
				pstm.setString(1, "%"+texto[i]+"%");
				pstm.execute();

				try (ResultSet rst = pstm.getResultSet()) {
					while (rst.next()) {
						Produto produto = new Produto(rst.getInt(1), rst.getString(2), rst.getString(3),
								rst.getDouble(4), rst.getDate(5));

						produtos.add(produto);
					}
				}
				
			}
		}
		return produtos;
	}
}
