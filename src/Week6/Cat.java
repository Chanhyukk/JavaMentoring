package Week6;

import java.time.LocalDateTime;

public class Cat {
    private String name;
    private String breed;
    private LocalDateTime birthday;
    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
        this.birthday = LocalDateTime.now();
    }
    public String toString() {
        return "name: " + name + "\n" +
                "breed: " + breed + "\n" +
                "birthDay: " + birthday;
    }
}
