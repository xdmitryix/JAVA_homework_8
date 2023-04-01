public class Newt extends Amphibians implements Swimable {

    public Newt(String name, int weigth) {
        super(name, weigth);
    }
    
    @Override
    public int swimSpeed() {
        return 3;
    }
}
