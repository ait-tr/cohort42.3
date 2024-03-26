package homework;

//Распечатайте все натуральные числа меньшие 200 и кратные 13.

public class NumbersBy13 {
    public static void main(String[] args) {
        int n = 1;
        while (n < 200){
            if(n % 13 == 0) {
                System.out.println(n);
            }
            n++;
        }
    }
}
