import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, 
который вернет “перевернутый” список. Постараться не обращаться к листу по индексам. */

public class reverse {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
        revers(list);
    }

    static void revers(LinkedList<Integer> list){
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
