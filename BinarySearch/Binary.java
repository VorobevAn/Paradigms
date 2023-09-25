package BinarySearch;

//Написать программу для
//бинарного поиска. На вход подаётся целочисленный массив и
//число. На выходе - индекс элемента или -1, в случае если искомого
//элемента нет в массиве.


public class Binary {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8, 9, 12, 15};
        int num = 3;
        System.out.println("Индекс искомого элемента массива: " + search(arr, num));
    }

    /**
     * @param arr передаваемый отсотрированный массив
     * @param num Число для поиска в массиве
     */


    public static int search(int arr[], int num) {
        int first = 0;
        int last = arr.length - 1;
        int centralEl = arr.length / 2;
        while (first <= last) {
            if (arr[centralEl] == num) {
                return centralEl;
            }
            if (arr[centralEl] < num) { // если искомый элемент больше центрального ищем с права
                first = centralEl + 1;
            }
            if (arr[centralEl] > num) {   // если искомый элемент больше центрального ищем с левa
                last = centralEl - 1;
            }
            centralEl = ((last - first) / 2) + first;
        }
        System.out.println("искомого элемента нет в массиве");

        return -1;
    }

}

