public class Frog extends Amphibians {

    public Frog(String name, int weigth) {
        super(name, weigth);
    }
    
    @Override
    public String feed() {
        return "черви, насекомые, комары";
    }
}
