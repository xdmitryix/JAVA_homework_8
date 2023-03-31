public abstract class Invertebrates extends AnimalTerrarium {

    public Invertebrates(String name, int weigth) {
        super(name, weigth);
    }

    @Override
    public String feed() {
        return "мусор, крошечные животные, водоросли";
    }
    
}
