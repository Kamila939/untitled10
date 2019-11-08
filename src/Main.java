import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Labrodor("Ray") {
            @Override
            public void animal() {

            }
        });

        for(Dog dog: dogs){
            dog.animal();
        }
    }
}