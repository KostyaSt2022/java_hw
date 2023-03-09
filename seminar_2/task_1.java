import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации (после перемещения числа) запишите в лог-файл.


public class task_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Несортированный массив: " + Arrays.toString(array));
        // System.out.println(Arrays.toString(array));

        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            String stringLogger = Arrays.toString(array);
            fileWriter(stringLogger);
            for (int i=0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    isSorted = false;

                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        System.out.println("Пузырьковая сортировка: " + Arrays.toString(array));
    }


    public static void fileWriter (String inputString) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/seminar_2/task_1_log.txt");
            FileWriter x = new FileWriter(pathFile, true);
            x.append(inputString+"\n");
            x.flush();
            x.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}