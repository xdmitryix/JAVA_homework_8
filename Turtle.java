public class Turtle extends Reptiles{

    public Turtle(String name, int weigth) {
        super(name, weigth);
    }

    @Override
    public String feed() {
        return "трава, водоросли, листья";
    }
}