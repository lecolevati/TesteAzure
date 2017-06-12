package persistence;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Criado pelo Prof. M.Sc. Leandro Colevati dos Santos
 */
public class GenericDao {

	private Connection con;

	public Connection getConnection() {

		try {
			String hostName = "dbcolevati";
	        String dbName = "primeiroteste";
	        String user = "l.colevati";
	        String password = "8560Leco";
	        String url = String.format("jdbc:sqlserver://%s.database.windows.net:1433;database=%s;user=%s;password=%s;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
	        con = DriverManager.getConnection(url);
	        String schema = con.getSchema();
	        System.out.println(schema);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public void fechaConexao() {
		try {
			if (con != null)
				con.close();
			con = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
