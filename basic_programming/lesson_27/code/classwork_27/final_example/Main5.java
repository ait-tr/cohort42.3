package classwork_27.final_example;

public class Main5 {
    public static void main(String[] args) {
        // так делать не надо: final переменные обычно должны быть неизменяемыми
        final Car car1 = new Car("bmw", 2008);
        // car = new Car("audi", 1990); // ошибка
        car1.builtYear = 2050;
        System.out.println(car1);

        double PI = 3.14;
    }
}
