package interface_example;

import java.util.Scanner;

public class Controller {
   // BirdRepository birdRepository = BirdRepository.getInstance();
   // UserInterface userInterface = UserInterface.getInstance();
    static final int EXIT_VALUE = 8;

    public static void main(String[] args) {
        UserInterface userInterface = UserInterface.getInstance();
        Controller controller = new Controller();
        int option = 0;
        while (option != EXIT_VALUE) {
            option = userInterface.showMainMenu();
            controller.handleUserSelection(option);
        }
    }

    public void handleUserSelection(int option) {
        BirdRepository birdRepository = BirdRepository.getInstance();
        UserInterface userInterface = UserInterface.getInstance();
        switch (option) {
            case 1:
                addBird();
                break;
            case 2:
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the name of bird you want to delete ");
                String birdName = sc.nextLine();
                Bird bird = birdRepository.getBird(birdName);
                birdRepository.remove(bird);
                break;
            case 3:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter The Bird Name For Update");
                String updateBirdName = scanner.nextLine();
                Bird bird1 = birdRepository.getBird(updateBirdName);
                update(bird1);
                break;
            case 4:
                userInterface.printAllBirds(birdRepository.getBirdList());
                break;
            case 5:
                userInterface.printSwimmableBirds(birdRepository.getBirdList());
                break;
            case 6:
                userInterface.printFlyableBirds(birdRepository.getBirdList());
                break;
            case 7:
                userInterface.printEat(birdRepository.getBirdList());
                break;
            case EXIT_VALUE:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid option selected: ");
        }
    }

    private void addBird() {
        BirdRepository birdRepository = BirdRepository.getInstance();
        Bird bird = new Bird();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bird name");
        bird.name = sc.next();
        setBirdColour(bird);
        setBirdGender(bird);
        System.out.println("Enter is bird swimmable?");
        bird.isSwimmable = sc.nextBoolean();
        System.out.println("Enter is bird flyable?");
        bird.isFlyable = sc.nextBoolean();
        birdRepository.add(bird);
    }

    private void update(Bird bird) {
        System.out.println("Enter your selection\n 1.name \n 2.colour \n 3.gender");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter New Name:");
                bird.name = sc.next();
                break;
            case 2:
                setBirdColour(bird);
                break;
            case 3:
                setBirdGender(bird);
                break;
            case 4:
                System.out.println("bird isSwimmable");
                bird.isSwimmable = sc.nextBoolean();
                break;
            case 5:
                System.out.println("bird isFlyable");
                bird.isFlyable = sc.nextBoolean();
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    private void setBirdGender(Bird bird) {
        System.out.println("Enter the choose \n 1.Male \n 2.Female \n 3.Other");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                bird.gender = Bird.Gender.MALE;
                break;
            case 2:
                bird.gender = Bird.Gender.FEMALE;
                break;
            case 3:
                bird.gender = Bird.Gender.OTHER;
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    private void setBirdColour(Bird bird) {
        System.out.println("Enter the choose \n 1.Green \n 2.Red \n 3.Black \n 4.Black_White \n 5.White ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        switch (option) {
            case 1:
                bird.colour = Bird.Colour.GREEN;
                break;
            case 2:
                bird.colour = Bird.Colour.RED;
                break;
            case 3:
                bird.colour = Bird.Colour.BLACK;
                break;
            case 4:
                bird.colour = Bird.Colour.BLACK_WHITE;
                break;
            case 5:
                bird.colour = Bird.Colour.WHITE;
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
