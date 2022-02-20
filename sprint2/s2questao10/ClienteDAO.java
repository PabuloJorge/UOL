package s2questao10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mchange.v2.sql.filter.SynchronizedFilterDataSource;

public class ClienteDAO {

	private Connection connection;

	public ClienteDAO(Connection connection) {
		this.connection = connection;
	}

	public void salvar(Cliente cliente) throws SQLException {
		String sql = "INSERT INTO CLIENTE (NOME, SENTIMENTO) VALUES (?, ?)";

		try (PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getSentimento());

			pstm.execute();

		}
	}

}
