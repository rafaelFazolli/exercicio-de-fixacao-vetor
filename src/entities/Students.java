package entities;

public class Students {
    private String name;
    private String email;
    private int bedroom;

    public Students(String name, String email, int bedroom) {
        this.name = name;
        this.email = email;
        this.bedroom = bedroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public String toString() {
        return  "\nNome:  " + name + "\nEmail:  " + email + "\nQuarto:  " + bedroom;
    }
}
