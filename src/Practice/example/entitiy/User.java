package Practice.example.entitiy;
// 20250120-6
public class User {
    private String name;

    private String phomeNumber;

    public User(String name, String phomeNumber) {
        this.name = name;
        this.phomeNumber = phomeNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phomeNumber='" + phomeNumber + '\'' +
                '}';
    }
}
