package day9.test3;

public class User {
    private int id;
    private String type;

    public User() {
    }

    public User(int id, String type) {
        this.type = type;
        this.id = id;
    }

    @Override
    public String toString() {
        return id + "-" + type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
