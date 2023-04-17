import java.util.Scanner;

/**
 * Задача 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n),
* n! (произведение чисел от 1 до n)
 */


public class task1_1 {
    
    public static void main(String[] args) {
        
        System.out.printf("Введите число n: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int sum = 0;
        int factorial = 1;
        
        for (int i = 1; i <= n; i++) {
            sum += i;
            factorial *= i;            
        }
        
        System.out.printf("Сумма чисел от 1 до %d: %d%n", n, sum);
        System.out.printf("Произведение чисел от 1 до %d: %d%n", n, factorial);
        num.close();
  }

}
