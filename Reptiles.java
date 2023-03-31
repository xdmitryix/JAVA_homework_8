public abstract class Reptiles extends AnimalTerrarium {

    public Reptiles(String name, int weigth) {
        super(name, weigth);
    }

    @Override
    public String feed() {
        return "насекомые";
    }
    
}
