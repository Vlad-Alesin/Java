public class Toy {

    int id;
    String name;
    double weight;

    public Toy(int id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Выигранная игрушка - [id= " + id + ", Название= " + name + ", вероятность= " + weight +"/110" + "]";
    }
}