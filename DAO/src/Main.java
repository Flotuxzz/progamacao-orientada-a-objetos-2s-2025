import java.util.*;
import models.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Consultar usuários");
            System.out.println("3 - Cadastrar veículo");
            System.out.println("4 - Consultar veículos");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            String op = sc.nextLine();

            switch (op) {
                case "1" -> cadastrarUsuario();
                case "2" -> consultarUsuarios();
                case "3" -> cadastrarVeiculo();
                case "4" -> consultarVeiculos();
                case "0" -> {
                    System.out.println("Encerrando...");
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private static void cadastrarUsuario() {
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Role (regular/admin): ");
        String role = sc.nextLine().trim();

        User u = role.equals("admin")
            ? new AdminUser(name, email)
            : new RegularUser(name, email);

        u.save();
        System.out.println("Usuário salvo!");
    }

    private static void consultarUsuarios() {
        List<User> users = User.all();
        users.forEach(u -> System.out.println(u.display()));
    }

    private static void cadastrarVeiculo() {
        System.out.print("ID do proprietário: ");
        int owner = Integer.parseInt(sc.nextLine());

        System.out.print("Marca: ");
        String make = sc.nextLine();

        System.out.print("Modelo: ");
        String model = sc.nextLine();

        System.out.print("Ano: ");
        int year = Integer.parseInt(sc.nextLine());

        System.out.print("Placa: ");
        String plate = sc.nextLine();

        Vehicle v = new Vehicle(owner, make, model, year, plate);
        v.save();

        System.out.println("Veículo salvo!");
    }

    private static void consultarVeiculos() {
        List<Vehicle> list = Vehicle.all();
        list.forEach(v -> System.out.println(v.display()));
    }
}
