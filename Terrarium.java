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

    public void highWAight(){
        Integer maxWeigth = inhabitants.get(0).getWeigth();
        String nameMaxWeight = inhabitants.get(0).getName();
        for (AnimalTerrarium inhabitan : inhabitants) {
            if (inhabitan.getWeigth() > maxWeigth) {
                maxWeigth = inhabitan.getWeigth();
                nameMaxWeight = inhabitan.getName();
            }
        }
        System.out.println(String.format("Животное в терариуме с максимальным весом: %s, его вес: %d грамм\n", nameMaxWeight, maxWeigth));
    }

    private List<Swimable> swimers(){
        List<Swimable> swList = new ArrayList<>();
        for (AnimalTerrarium inabitant : inhabitants) {
            if (inabitant instanceof Swimable) {
                swList.add((Swimable)inabitant);
            }
        }
        return swList;
    }

    public AnimalTerrarium chempBySwim(){
        List<Swimable> res = swimers();
        Swimable champ = res.get(0);
        for (Swimable swimmer : res) {
            if (swimmer.swimSpeed() > champ.swimSpeed()) {
                champ = swimmer;
            }        
        }
        return (AnimalTerrarium) champ;
    }

    

}
