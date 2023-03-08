package seminar_1;

import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n),
// а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

public class task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int i = scan.nextInt();
        System.out.printf("Треугольное число: %d\n", sumNumbers(i));
        System.out.printf("Факториал: %d\n", factorial(i));
        scan.close();
    }

    public static int sumNumbers(int n) {
        return (n * (n + 1) / 2);
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
           result = result * i;
        }
        return result;
    }

}