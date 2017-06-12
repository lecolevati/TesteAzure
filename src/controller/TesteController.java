package controller;

import java.sql.SQLException;
import java.util.List;

import model.Teste;
import persistence.TesteDao;

public class TesteController {

	public TesteController() {
		super();
	}
	
	public void listaTeste() throws SQLException {
		TesteDao tDao = new TesteDao();
		List<Teste> lista = tDao.listaTestes();
		for (Teste t : lista){
			System.out.println(t.getId());
			System.out.println(t.getCampo());
			System.out.println("________________________");
		}
	}
	
}
