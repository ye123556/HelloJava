package practice.example.entity;

import java.util.Objects;

// 20250120-6
public class User {
    private String name;

    private String phomeNumber;

    public User(String name, String phomeNumber) {
        this.name = name;
        this.phomeNumber = phomeNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhomeNumber() {
        return phomeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof User user)) return false;
        return Objects.equals(name, user.name) && Objects.equals(phomeNumber, user.phomeNumber);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
