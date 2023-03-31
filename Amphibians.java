public abstract class Amphibians extends AnimalTerrarium {

    public Amphibians(String name, int weigth) {
        super(name, weigth);

    }

    @Override
    public String feed() {
        return "черви, насекомые, моллюски";
    }
    
}
