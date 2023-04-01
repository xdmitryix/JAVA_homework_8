public class Crayfish extends Invertebrates implements Swimable{

    public Crayfish(String name, int weigth) {
        super(name, weigth);
    }

    @Override
    public int swimSpeed() {
        return 2;
    }
    
}