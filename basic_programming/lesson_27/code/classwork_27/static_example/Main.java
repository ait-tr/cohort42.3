package classwork_27.static_example;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("bwm", 0);
        System.out.println(bmw);
        bmw.go(20);
        bmw.go(43);
        bmw.go(52);
        System.out.println(bmw);
    }
}
