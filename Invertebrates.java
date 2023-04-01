public abstract class Invertebrates extends AnimalTerrarium implements Swimable {

    public Invertebrates(String name, int weigth) {
        super(name, weigth);
    }

    @Override
    public String feed() {
        return "мусор, крошечные животные, водоросли";
    }

    @Override
    public int swimSpeed() {
        return ;
    }
    
}
