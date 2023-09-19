package SortList;
//Дан список целых чисел numbers. Необходимо написать в императивном стиле процедуру для
//сортировки числа в списке в порядке убывания. Можно использовать любой алгоритм сортировки.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 2, 10, 3, 1, 2, 5));
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(10, 2, 10, 3, 1, 2, 5));
        System.out.println(numbers);
        imperativSort(numbers);
        declorativSort(numbers2);
        System.out.println("сортировка в инперативном стиле "+numbers);
        System.out.println("сортировка в декларотивном стиле "+numbers2);
    }


    //Сортировка пузырьком в императивном стиле
    public static List<Integer> imperativSort(List<Integer> numbers) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < numbers.size(); i++) {
                if (numbers.get(i) > numbers.get(i - 1)) {
                    int tmp = numbers.get(i);
                    numbers.set(i, numbers.get(i-1));
                    numbers.set(i-1, tmp);
                    needIteration = true;
                }
            }
        }
        return numbers;
    }
    //Сортировка пузырьком в декларотивном стиле
    public static List<Integer> declorativSort(List<Integer> numbers) {
        numbers.sort(Comparator.reverseOrder());

        return numbers;
    }
}
