package interface_example;
import java.util.ArrayList;
import java.util.List;

public class BirdRepository {
    private List<Bird> birdList = new ArrayList();

    public List<Bird> getBirdList() {
        return birdList;
    }

    public void add(Bird birds){
        birdList.add(birds);

    }
    public void remove(Bird birds){
        birdList.remove(birds);
    }

    public Bird getBird(String name){
        for (int i = 0; i < birdList.size(); i++){
            if (name.equalsIgnoreCase(birdList.get(i).name))
                return birdList.get(i);
        }
        return null;
    }

}
