package br.fepi.si.app;

import javax.persistence.Persistence;

public class TesteConexaoApp {

	public static void main(String[] args) {
		try {
			Persistence.createEntityManagerFactory("testePU");
			System.out.println("Conectado com sucesso");
		} catch (Exception e) {
			System.out.println("Falha na conexão. " + e.getMessage());
		}
	}

}
