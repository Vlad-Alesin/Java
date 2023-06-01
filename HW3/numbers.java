/*Пусть дан произвольный список целых чисел, удалить из него четные числа */

import java.util.ArrayList;
import java.util.List;

public class numbers {
    public static void main(String[] args) {
    
        List<Integer> list = createList(0, 100, 15);
        System.out.println(list);
    
    }

    static List<Integer> createList(int min, int max, int count){
        List<Integer> list = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            int rnd = (int)(Math.random() * (max - min +1) + min);
            list.add(rnd);
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            Object object = list.get(i);
            int intV = Integer.parseInt(object.toString());
            if (intV % 2 == 0){
                list.remove(i);
                i--;
            }
        }
    return list;
    }
}
