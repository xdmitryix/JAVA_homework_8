public class Frog extends Amphibians implements Swimable {

    public Frog(String name, int weigth) {
        super(name, weigth);
    }
    
    @Override
    public String feed() {
        return "черви, насекомые, комары";
    }

    @Override
    public int swimSpeed() {
        return 1;
    }
}
