import java.util.ArrayList;
import java.util.List;

public class Terrarium {
    private List<AnimalTerrarium> inhabitants = new ArrayList<>();
    
    public void addAnimal (AnimalTerrarium newAnimalTerrarium){
        this.inhabitants.add(newAnimalTerrarium);
    }

    public void showAll(){
        for (AnimalTerrarium inhabitant: this.inhabitants) {
            System.out.println(inhabitant);
        }
    }
}
