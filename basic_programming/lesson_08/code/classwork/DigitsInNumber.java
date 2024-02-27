package classwork;

//Пользователь вводит натуральное число (целое, положительное).
//Выясните, сколько цифр в числе.
// 356712 - это ввел пользователь, программа должна выдать: 6 цифр
// 1234567890987654 3 2 1 - 19 цифр

import java.util.Scanner;

public class DigitsInNumber {
    public static void main(String[] args) {

        //Алгоритм:
        // числа записываются в 10-тичной системе счисления, каждый знак отвечает за разряд числа
        // будем на каждом шагу делить число на 10 с остатком.

        // Взаимодействие с пользователем:
        // запросить у него число
        // напечатать число = кол-ву цифр

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer and positive number: ");
        long number = scanner.nextLong();
        int count = 0;

        while ( number > 0 ) {
            number = number / 10; // деление дает нам сколько цифр
            count++; // увеличиваем счетчик
        }
        System.out.println("Number of digits are: " + count);
    }
}
