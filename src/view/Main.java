package view;

import java.sql.SQLException;

import controller.TesteController;

public class Main {

	public static void main(String[] args) {
		TesteController tc = new TesteController();
		try {
			tc.listaTeste();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
