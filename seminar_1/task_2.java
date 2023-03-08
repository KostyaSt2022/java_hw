package seminar_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Вывести все простые числа от 1 до 1000

public class task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите положительное число: ");
        int numb = scan.nextInt();
        scan.close();
        List<Integer> prime = new ArrayList<>();
        
        for (int i=2; i <= numb; i++) {
            boolean isPrimeNumber = true;

            for (int j=2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                prime.add(i);
            }
        }
        System.out.println("Простые числа: " + prime);
    }
}
