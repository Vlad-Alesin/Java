/*Заполнить список названиями планет Солнечной системы 
в произвольном порядке с повторениями. Вывести название 
каждой планеты и количество его повторений в списке. Collections.frequency() */



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;


public class planet {
    public static void main(String[] args) {

        List<String> list = createList(12);
        System.out.println(list);
        Set<String> distinct = new HashSet<>(list);
        for (String s: distinct) {
            System.out.println(s + ": " + Collections.frequency(list, s));
        }
    } 

    static List<String> createList(int count){
        List<String> list = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            int rnd = (int)(Math.random() * 9 + 1);
            if (rnd == 1){
                list.add("Меркурий");
            }
            if (rnd == 2){
                list.add("Венера");
            }
            if (rnd == 3){
                list.add("Земля");
            }
            if (rnd == 4){
                list.add("Марс");
            }
            if (rnd == 5){
                list.add("Юпитер");
            }
            if (rnd == 6){
                list.add("Сатурн");
            }
            if (rnd == 7){
                list.add("Уран");
            }
            if (rnd == 8){
                list.add("Нептун");
            }
            if (rnd == 9){
                list.add("Плутон");
            }
        }
        return list;
    }
}