package interface_example;

public class Penguin extends Bird implements Swimmable{
    public Penguin(){
        name = "Penguin";
        colour = Colour.BLACK_WHITE;
    }
    @Override
    public void swim() {
        System.out.println("Penguin can swim");
    }
}
