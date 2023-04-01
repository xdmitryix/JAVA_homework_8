public class Turtle extends Reptiles implements Swimable{

    public Turtle(String name, int weigth) {
        super(name, weigth);
    }

    @Override
    public String feed() {
        return "трава, водоросли, листья";
    }

    @Override
    public int swimSpeed() {
        return 11;
    }
}