public class Salamander extends Amphibians implements Swimable {

    public Salamander(String name, int weigth) {
        super(name, weigth);
    }

    @Override
    public int swimSpeed() {
        return 17;
    }
    
}
