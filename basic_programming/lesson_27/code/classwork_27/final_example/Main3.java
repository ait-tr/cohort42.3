package classwork_27.final_example;

public class Main3 {
    public static void main(String[] args) {
        // при попытки переопределния переменной будет ошибка
        final double PI = 3.14;
        System.out.println("Площаль окружности с радиусом 2: " + PI * 4);
    }
}
