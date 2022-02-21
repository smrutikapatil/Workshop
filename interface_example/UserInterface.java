package interface_example;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public void printAllBirds(List<Bird> list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public int showMainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option \n " +
                "1.Add Birds\n " +
                "2.Remove Birds\n " +
                "3.Update the Birds\n " +
                "4.Print Birds\n " +
                "5.Print swimmable Birds \n " +
                "6.Print Flyable Birds \n " +
                "7.Exit");
        return (sc.nextInt());
    }
}

