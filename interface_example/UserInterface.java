package interface_example;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {

    static UserInterface Instance;
    private UserInterface() {
    }

    public static synchronized UserInterface getInstance() {
        if (Instance == null) {
            Instance = new UserInterface();
        }
        return Instance;
    }

    public void printAllBirds(Set<Bird> list) {
        list.stream().forEach(System.out::println);
    }

    public int showMainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option \n " + "1.Add Birds\n " + "2.Remove Birds\n " + "3.Update the Birds\n " +
                "4.Print Birds\n " + "5.Print Swimmable Birds \n " + "6.Print Flyable Birds \n "
                + "7.Print Eating Birds \n " + Controller.EXIT_VALUE + ".Exit");
        return (sc.nextInt());
    }

    public void printSwimmableBirds(Set<Bird> list) {
        list.stream().filter(bird -> bird.isSwimmable).forEach(System.out::println);
    }

    public void printFlyableBirds(Set<Bird> list) {
        list.stream().filter(bird -> bird.isFlyable).forEach(System.out::println);
    }

    public void printEat(Set<Bird> list) {
        list.stream().forEach(Bird::eat);
    }
}


