import java.io.FileWriter;
import java.util.List;
import java.io.IOException;


public class ToyStore {
    private List<Toy> toys;

    public ToyStore(List<Toy> toys) {
        this.toys = toys;
    }
    
    public Toy getToy() {
        RandomToy random = new RandomToy();
        Toy toy = random.chooseOnWeight(toys);
        return toy;
    }

    public void saveToyForLottery() {
        Toy toy = getToy();
        String text = toy.toString();
        try(FileWriter writer = new FileWriter("Toys.txt", true))
        { 
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        toys.remove(toy);
    }
}