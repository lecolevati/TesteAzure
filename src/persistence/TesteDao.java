package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Teste;

public class TesteDao {

	private Connection c;
	
	public TesteDao() {
		GenericDao gDao = new GenericDao();
		c = gDao.getConnection();
	}
	
	public List<Teste> listaTestes() throws SQLException {
		List<Teste> lista = new ArrayList<Teste>();
		String sql = "select id, campo from teste";
		PreparedStatement ps = c.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()){
			Teste t = new Teste();
			t.setId(rs.getInt("id"));
			t.setCampo(rs.getString("campo"));
			lista.add(t);
		}
		rs.close();
		ps.close();
		return lista;
		
	}
	
}
