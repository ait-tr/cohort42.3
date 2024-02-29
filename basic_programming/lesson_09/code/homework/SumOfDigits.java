package homework;

//Вводится положительное целое число, найдите сумму его цифр.

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer and positive number: ");
        int num = scanner.nextInt();

        while (num <= 0) {
            System.out.println("Wrong input! Try again.");
            num = scanner.nextInt();
        }

        int sumOfDigits = 0;
        int inputNum = num;

        while (num > 0) {
            sumOfDigits += num % 10;
            num = num/10;
        }
        System.out.println("Sum of digits of " + inputNum + " = " + sumOfDigits);
    }
}
