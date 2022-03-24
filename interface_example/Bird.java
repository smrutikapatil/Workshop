package interface_example;

public class Bird {
    enum Colour {
        GREEN, BLACK, RED, YELLOW, WHITE, BLACK_WHITE
    }

    enum Gender {
        MALE, FEMALE, OTHER
    }

    String name;
    Colour colour;
    Gender gender;

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", colour=" + colour +
                ", gender=" + gender +
                ", isFlyable=" + isFlyable +
                ", isSwimmable=" + isSwimmable +
                '}';
    }

    boolean isFlyable;
    boolean isSwimmable;


    void eat() {
        System.out.println(name + " can eat ");
    }
}
