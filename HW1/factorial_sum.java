import java.util.Scanner;

public class factorial_sum {
    public static void main(String[] args) {
        
        int n = input();
        System.out.println("Сумма от 1 до n: " + sum(n));
        System.out.println("Факториал: " + factorial(n));           
    }
        
    static int input(){    
        Scanner Scanner = new Scanner(System.in);
        System.out.printf("Введите n: ");
        int n = Scanner.nextInt();
        return n; 
    }    

    static int sum(int n){
        if (n==1) return 1;
        else return n + sum(n-1);     
    }

    static int factorial(int n){
        if (n==1) return 1;
        return n * factorial(n-1);
    }
            
}
