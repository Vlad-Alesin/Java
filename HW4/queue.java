import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди, 
 * dequeue() - возвращает первый элемент из очереди и удаляет его, 
 * first() - возвращает первый элемент из очереди, не удаляя.
 */

 public class queue {
     public static void main(String[] args) {
         LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
         Scanner scanner = new Scanner(System.in);
         System.out.println("Введите элемент:");
         enqueue(list, scanner.nextInt());
         System.out.println(list);
         System.out.println(dequeue(list));
         System.out.println(list);
         System.out.println(first(list));
         System.out.println(list);
         scanner.close();
     }
     public static void enqueue(LinkedList<Integer> list, int element){
        list.add(element);
     }
     public static int dequeue(LinkedList<Integer> list){
         int a = list.getFirst();
         list.removeFirst();
         return a;
 
     }
     public static int first(LinkedList<Integer> list){
         return list.getFirst();
     }
 }