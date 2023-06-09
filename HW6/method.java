/*Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
 Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет 
5 - Диагональ
6 - Процессор
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметр*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class method {

    public static void main(String[] args) throws Exception {

        Laptop laptop1 = new Laptop ("HUAWEI MateBook D15", 8, 512, "Windows 11", "серый", 15.6, "i5");
        Laptop laptop2 = new Laptop ("Apple MacBook Air 13", 8, 256, "Mac OS X", "серый космос", 16.1, "M1");
        Laptop laptop3 = new Laptop ("HONOR MagicBook X 15", 8, 256, "Windows 11", "серый", 15.6, "i3");
        Laptop laptop4 = new Laptop ("Thunderobot 911 Air Wave D", 8, 256, "без ОС", "черный", 15.6, "i5");
        Laptop laptop5 = new Laptop ("Acer Nitro 5", 16, 512, "без ОС", "черный", 15.6, "i5");


        Set<Laptop> unicLaptop = new HashSet<Laptop>();
        unicLaptop.add(laptop1);
        unicLaptop.add(laptop2);
        unicLaptop.add(laptop3);
        unicLaptop.add(laptop4);
        unicLaptop.add(laptop5);

        Map<Integer, String> mapCrit = new HashMap<>();
        mapCrit.put(1, "объем оперативной памяти");
        mapCrit.put(2, "объем накопителя");
        mapCrit.put(3, "ОС");
        mapCrit.put(4, "цвет");
        mapCrit.put(5, "диагональ");
        mapCrit.put(6, "процессор");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите желаемые характеристики: 1. объем оперативной памяти: ");
        int ramUser = sc.nextInt();
        System.out.println("диагональ (при написании используйте запятую, а не точку)");
        double diagUser = sc.nextDouble();
        System.out.println("объем накопителя: ");
        int storUser = sc.nextInt();
        

        for(Laptop lap: unicLaptop) {
            if ((lap.getRam() >= ramUser) && (lap.getDiagonal() >= diagUser) && (lap.getStorageCap() >= storUser)) {
                System.out.println(lap.toString());
            }
        }
        sc.close();
    }
}