public abstract class AnimalTerrarium {
    private String name;
    private int weigth;

    

    public AnimalTerrarium(String name, int weigth){
        this.name = name;
        this.weigth = weigth;
    }

    public int getWeigth() {
        return weigth;
    }

    public String getName() {
        return name;
    }

    public abstract String feed();

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Вид животного: %s\n", name))
                .append(String.format("Вес животного: %d\n", weigth))
                .append(String.format("Корм: %s\n", feed()));


        return res.toString();
    }

 

}

