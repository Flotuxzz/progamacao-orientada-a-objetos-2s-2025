package models;

public class AdminUser extends User {

    public AdminUser(String name, String email) {
        super(name, email, "admin");
    }

    public AdminUser(Integer id, String name, String email) {
        super(id, name, email, "admin");
    }

    @Override
    public String display() {
        return "AdminUser [" + id + "] " + name + " (FULL ACCESS)";
    }
}

