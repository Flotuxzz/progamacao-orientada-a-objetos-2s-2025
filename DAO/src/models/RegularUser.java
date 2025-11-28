package models;

public class RegularUser extends User {

    public RegularUser(String name, String email) {
        super(name, email, "regular");
    }

    public RegularUser(Integer id, String name, String email) {
        super(id, name, email, "regular");
    }

    @Override
    public String display() {
        return "RegularUser [" + id + "] " + name + " <" + email + ">";
    }
}
