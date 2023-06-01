/* Задан целочисленный список ArrayList. Найти минимальное, 
максимальное и среднее арифметическое из этого списка. 
Collections.max()*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class arrayList {
    
    public static void main(String[] args) {
    
        List<Integer> list = createList(0, 100, 15);
        System.out.println(list);
        System.out.println("min = " + getMin(list));
        System.out.println("max = " + getMax(list));
        System.out.println("avg = " + getAvg(list));
    }

    static List<Integer> createList(int min, int max, int count){
        List<Integer> list = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            int rnd = (int)(Math.random() * (max - min +1) + min);
            list.add(rnd);
        }
        return list;
    }
    public static Integer getMin(List<Integer> list){
        return Collections.min(list);
    }
    public static Integer getMax(List<Integer> list){
        return Collections.max(list);
    }
    public static Integer getAvg(List<Integer> list){
        int b = 0;
        for (int i = 0; i < list.size(); i++) {
            b += list.get(i);    
        }
        int avg = b / list.size();
        return avg;
    }


}
