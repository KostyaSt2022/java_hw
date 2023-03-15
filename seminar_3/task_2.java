import java.util.ArrayList;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа

public class task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            numbers.add(new Random().nextInt(0, 100));
        }
        System.out.println(numbers);
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }
        System.out.println(numbers);
    }
}