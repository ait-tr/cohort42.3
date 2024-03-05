package homework;

/*Напечатайте на экране шахматную доску размером 8х8.
0 - белая клеточка, 1 - черная.
Левая верхняя клеточка должна быть 0, левая нижняя - 1.*/

public class ChessDeck {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        while (i < 8){
            while (j < 8){
                System.out.print((i + j) % 2 + " | ");
                j++;
            }
            System.out.println();
            j = 0;
            i++;
        }
    }
}
