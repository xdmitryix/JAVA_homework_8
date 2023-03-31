public class Snake extends Reptiles{

    public Snake(String name, int weigth) {
        super(name, weigth);
    }
    
    @Override
    public String feed() {
        return "насекомые, рыбы, грызуны";
    }
}
