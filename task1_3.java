import java.util.Scanner;

/**
* Задача 3. Реализовать простой калькулятор (пользователь вводит 2 числа и
вводит операцию (+ - / *).
*/


public class task1_3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите первое число: ");
        Scanner n1 = new Scanner(System.in);
        int num1 = n1.nextInt();
        
        System.out.printf("Введите второе число: ");
        Scanner n2 = new Scanner(System.in);
        int num2 = n2.nextInt();

        System.out.printf("Введите операцию (+; -; *; /): ");
        char operation = scanner.next().charAt(0);

        int result = 0;
        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            }
    System.out.println("Результат операции: " + result);
    n1.close();
    n2.close();
    }
}
