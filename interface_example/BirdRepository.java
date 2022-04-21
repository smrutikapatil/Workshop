package interface_example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BirdRepository {
    //private List<Bird> birdList = new ArrayList();
    private Set<Bird>  birdList;

    static BirdRepository instance;

    private BirdRepository() {
    }

    public static synchronized BirdRepository getInstance() {
        if (instance == null) {
            instance = new BirdRepository();
        }
        return instance;
    }

    public Set<Bird> getBirdList() {
        return birdList;
    }

    public void add(Bird birds) {
        birdList.add(birds);
    }

    public void remove(Bird birds) {
        birdList.remove(birds);
    }

    public Bird getBird(String name) {

        return birdList.stream().filter(bird -> bird.name.equals(name)).findFirst().orElse(null);
    }
}
