package homework;
// Метод main вызывает method1. method1 вызывает method2. method2 вызывает method3.
// В каждом методе должно происходить следующее:
// + Печатает в консоль информацию, что метод такой-то стартовал
// + Вызывает следующий метод
// + Печатает в консоль, что метод такой-то финишировал

public class Methods {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        System.out.println("Method 1 starts");
        method2();
        System.out.println("Method 1 finished");
    }

    private static void method2() {
        System.out.println("Method 2 starts");
        method3();
        System.out.println("Method 2 finished");
    }

    private static void method3() {
        System.out.println("Method 3 starts");
        System.out.println("3, 2, 1...");
        System.out.println("Method 3 finished");
    }

}
