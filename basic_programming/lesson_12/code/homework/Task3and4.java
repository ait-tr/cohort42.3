package homework;
/*Для задач далее (3 и 4) задайте массив из 10 случайных чисел в интервале от -10 до 10.
Протестируйте работу методов на созданном массиве.

Задача 3.
Написать метод, принимающий массив целых чисел, и возвращающий сумму всех его
нечетных элементов.

Задача 4.
Написать метод, принимающий массив целых чисел, и возвращающий произведение
всех его элементов с четными индексами.*/

public class Task3and4 {
    public static void main(String[] args) {



    }

    // print array
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    // fill array with random numbers
    public static void fillArray(int[] arr, int a, int b){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (b - a + 1) + a);
        }
    }

}
