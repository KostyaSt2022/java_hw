import java.util.ArrayList;
import java.util.Random;

// (Дополнительное) Реализовать алгоритм сортировки слиянием

public class task_1_dop {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            numbers.add(new Random().nextInt(-10, 11));
        }
        System.out.println("Список без сортировки: " + numbers);
        System.out.println("Сортированный список: " + mergeSort(numbers));
    }

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> numbers) {
        if (numbers.size() <= 1) return numbers;
        int middle = numbers.size() / 2;
        ArrayList<Integer> leftList = mergeSort(new ArrayList<>(numbers.subList(0, middle)));
        ArrayList<Integer> rightList = mergeSort(new ArrayList<>(numbers.subList(middle, numbers.size())));
        ArrayList<Integer> result = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;
        while (leftIndex < leftList.size() && rightIndex < rightList.size()) {
            if (leftList.get(leftIndex) < rightList.get(rightIndex)) {
                result.add(leftList.get(leftIndex));
                leftIndex++;
            } else {
                result.add(rightList.get(rightIndex));
                rightIndex++;
            }
        }
        while (leftIndex < leftList.size()) {
            result.add(leftList.get(leftIndex));
            leftIndex++;
        }
        while (rightIndex < rightList.size()) {
            result.add(rightList.get(rightIndex));
            rightIndex++;
        }
        return result;
    }
}