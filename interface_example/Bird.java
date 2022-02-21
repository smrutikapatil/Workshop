package interface_example;

public class Bird {
    enum Colour {
        GREEN, BLACK, RED, YELLOW, WHITE, BLACK_WHITE;
    }
    enum Gender {
        MALE, FEMALE, OTHER;
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
                '}';
    }

    void eat(){
            System.out.println(getClass().getSimpleName() + " can eat " );
    }

    boolean doesMakesNest(){
        return false;
    }
}
