/*Реализуйте структуру телефонной книги с помощью HashMap,
учитывая, что 1 человек может иметь несколько телефонов.  */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class phonebook {    
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addInfo("Ваня", 1234567, bookPhone);
        addInfo("Света", 1298796, bookPhone);
        addInfo("Света", 1000000, bookPhone);
        addInfo("Ваня", 5522887, bookPhone);
        addInfo("Коля", 3698521, bookPhone);
        addInfo("Ваня", 7412385, bookPhone);
        addInfo("Ваня", 7539515, bookPhone);
        printInfo(bookPhone);
       }
    
    public static void addInfo(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
   
    public static void printInfo(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    
}