import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Toy toy1 = new Toy(0, "Мыльные пузыри", 40);
        Toy toy2 = new Toy(1, "Брелок", 30);
        Toy toy3 = new Toy(2, "Плюшевый медведь", 20);
        Toy toy4 = new Toy(3, "Кукла барби", 10);
        Toy toy5 = new Toy(4, "Радиоуправляемая машинка", 5);
        Toy toy6 = new Toy(5, "Робопёс", 3);
        Toy toy7 = new Toy(6, "Набор Лего", 2);

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);
        toys.add(toy4);
        toys.add(toy5);
        toys.add(toy6);
        toys.add(toy7);

        ToyStore toyStore = new ToyStore(toys);
        toyStore.saveToyForLottery();

    }
}