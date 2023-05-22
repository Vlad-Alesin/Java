import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        int n1 = inputNumber();
        int n2 = inputNumber();
        String Oper = inputOperation();
        System.out.println(calculation(n1, n2, Oper));

    }

    static int inputNumber(){    
        Scanner Scanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int n = Scanner.nextInt();
        return n; 
    }  

    static String inputOperation(){    
        Scanner Scanner = new Scanner(System.in);
        System.out.printf("Введите операцию: ");
        String O = Scanner.nextLine();
        return O; 
    }

    static float calculation(int a, int b, String O){
        float res = 0f;
        if (O.contains("+")){
            res = a + b;
        }
        else if (O.contains("-")){
            res = a - b;
        }
        else if (O.contains("*")){
            res = a * b;
        }
        else if (O.contains("/")){
            res = a / b;
        }
        return res;
    }

}

