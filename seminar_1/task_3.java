package seminar_1;

import java.util.Scanner;


// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

public class task_3 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int numb1 = scanNumber();
        System.out.println("Введите оператор (+ - * /): ");
        String operations = scanOperations();
        System.out.println("Введите второе число: ");
        int numb2 = scanNumber();
        int result = getResult(operations, numb1, numb2);
        System.out.printf("%d %s %d = %d", numb1, operations, numb2, result);
    }

    public static int scanNumber() {
        Scanner scan = new Scanner(System.in);
        int numb = scan.nextInt();
        return numb;
    }

    public static String scanOperations() {
        Scanner scan = new Scanner(System.in);
        String operations = scan.nextLine();
        return operations;
    }

    public static int getResult(String opr, int numb1, int numb2) {
        int result = 0;
        switch (opr) {
            case "+":
            result = numb1 + numb2;
            break;
            case "-":
            result = numb1 - numb2;
            break;
            case "*":
            result = numb1 * numb2;
            break;
            case "/":
            result = numb1 / numb2;
            
            default:
            System.out.println("Введите оператор: + - * /");
            break;
        }
        return result;
    }
}
