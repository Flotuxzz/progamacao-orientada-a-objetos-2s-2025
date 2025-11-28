package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    // Arquivo SQLite que será criado na pasta do projeto
    private static final String URL = "jdbc:sqlite:app.db";

    private static Connection conn;

    public static Connection getConnection() {
        if (conn != null) {
            return conn;
        }

        try {
            // Carrega o driver do SQLite
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(URL);
            createTablesIfNotExists();
        } catch (Exception e) {
            System.out.println("Erro ao conectar ao banco: " + e.getMessage());
            conn = null;
        }

        return conn;
    }

    private static void createTablesIfNotExists() {
        String createUsers = "CREATE TABLE IF NOT EXISTS users (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT NOT NULL," +
                "email TEXT UNIQUE NOT NULL," +
                "role TEXT NOT NULL" +
                ");";

        String createVehicles = "CREATE TABLE IF NOT EXISTS vehicles (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "owner_id INTEGER NOT NULL," +
                "make TEXT NOT NULL," +
                "model TEXT NOT NULL," +
                "year INTEGER," +
                "plate TEXT," +
                "FOREIGN KEY(owner_id) REFERENCES users(id)" +
                ");";

        try (Statement stmt = conn.createStatement()) {
            stmt.execute(createUsers);
            stmt.execute(createVehicles);
        } catch (SQLException e) {
            System.out.println("Erro ao criar tabelas: " + e.getMessage());
        }
    }
}
