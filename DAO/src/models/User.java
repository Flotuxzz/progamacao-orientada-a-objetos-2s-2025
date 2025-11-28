package models;

import db.Database;
import java.sql.*;
import java.util.*;

public class User extends Model {

    protected Integer id;
    protected String name;
    protected String email;
    protected String role;

    public User(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public User(Integer id, String name, String email, String role) {
        this(name, email, role);
        this.id = id;
    }

    // Encapsulamento: getters
    public Integer getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getRole() { return role; }

    // POLIMORFISMO — será sobrescrito nas subclasses
    public String display() {
        return "User [" + id + "]: " + name + " (" + role + ")";
    }

    @Override
    public void save() {
        try {
            Connection conn = Database.getConnection();
            PreparedStatement stmt;

            if (id == null) {
                stmt = conn.prepareStatement(
                    "INSERT INTO users (name, email, role) VALUES (?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS
                );
                stmt.setString(1, name);
                stmt.setString(2, email);
                stmt.setString(3, role);
                stmt.executeUpdate();

                ResultSet keys = stmt.getGeneratedKeys();
                if (keys.next()) id = keys.getInt(1);

            } else {
                stmt = conn.prepareStatement(
                    "UPDATE users SET name=?, email=?, role=? WHERE id=?"
                );
                stmt.setString(1, name);
                stmt.setString(2, email);
                stmt.setString(3, role);
                stmt.setInt(4, id);
                stmt.executeUpdate();
            }

        } catch (SQLException e) {
            System.out.println("Erro ao salvar usuário: " + e.getMessage());
        }
    }

    public static List<User> all() {
        List<User> list = new ArrayList<>();

        try {
            Connection conn = Database.getConnection();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM users");

            while (rs.next()) {
                String role = rs.getString("role");

                User u = switch (role) {
                    case "admin" -> new AdminUser(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email")
                    );
                    default -> new RegularUser(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email")
                    );
                };

                list.add(u);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao carregar usuários: " + e.getMessage());
        }
        return list;
    }
}
