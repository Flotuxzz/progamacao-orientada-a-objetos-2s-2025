package models;

import db.Database;

import java.sql.*;
import java.util.*;

public class Vehicle extends Model {

    private Integer id;
    private int ownerId;
    private String make;
    private String model;
    private int year;
    private String plate;

    public Vehicle(int ownerId, String make, String model, int year, String plate) {
        this.ownerId = ownerId;
        this.make = make;
        this.model = model;
        this.year = year;
        this.plate = plate;
    }

    public Vehicle(Integer id, int ownerId, String make, String model, int year, String plate) {
        this(ownerId, make, model, year, plate);
        this.id = id;
    }

    @Override
    public void save() {
        try {
            Connection conn = Database.getConnection();

            PreparedStatement stmt;

            if (id == null) {
                stmt = conn.prepareStatement(
                    "INSERT INTO vehicles (owner_id, make, model, year, plate) VALUES (?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS
                );
                stmt.setInt(1, ownerId);
                stmt.setString(2, make);
                stmt.setString(3, model);
                stmt.setInt(4, year);
                stmt.setString(5, plate);
                stmt.executeUpdate();

                ResultSet keys = stmt.getGeneratedKeys();
                if (keys.next()) id = keys.getInt(1);

            } else {
                stmt = conn.prepareStatement(
                    "UPDATE vehicles SET owner_id=?, make=?, model=?, year=?, plate=? WHERE id=?"
                );
                stmt.setInt(1, ownerId);
                stmt.setString(2, make);
                stmt.setString(3, model);
                stmt.setInt(4, year);
                stmt.setString(5, plate);
                stmt.setInt(6, id);
                stmt.executeUpdate();
            }

        } catch (SQLException e) {
            System.out.println("Erro ao salvar veículo: " + e.getMessage());
        }
    }

    public static List<Vehicle> all() {
        List<Vehicle> list = new ArrayList<>();
        try {
            Connection conn = Database.getConnection();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM vehicles");

            while (rs.next()) {
                list.add(new Vehicle(
                        rs.getInt("id"),
                        rs.getInt("owner_id"),
                        rs.getString("make"),
                        rs.getString("model"),
                        rs.getInt("year"),
                        rs.getString("plate")
                ));
            }

        } catch (SQLException e) {
            System.out.println("Erro ao carregar veículos: " + e.getMessage());
        }
        return list;
    }

    public String display() {
        return "Vehicle [" + id + "] " + make + " " + model + " (" + year + ") plate:" + plate;
    }
}
