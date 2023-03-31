public class Main {
    public static void main(String[] args) {
        Terrarium terrarium = new Terrarium();
        terrarium.addAnimal(new Crab("краб", 1500));
        terrarium.addAnimal(new Crayfish("рак", 80));
        terrarium.addAnimal(new Mallusk("маллюск", 100));
        terrarium.addAnimal(new Frog("лягушка", 23));
        terrarium.addAnimal(new Salamander("саламандра", 1800));
        terrarium.addAnimal(new Newt("тритон", 400));
        terrarium.addAnimal(new Turtle("черепаха", 10000));
        terrarium.addAnimal(new Lizard("ящерица", 350));
        terrarium.addAnimal(new Snake("змея", 4000));
        terrarium.showAll();       
    }
    
}