public class Crab extends Invertebrates implements Swimable {

    public Crab(String name, int weigth) {
        super(name, weigth);
    }

    @Override
    public int swimSpeed() {
        return 2;
    }
    
}
