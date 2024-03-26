package homework;

public class ReverseArray {
    public static void main(String[] args) {

        int[] array = new int[10];
        int a = -10;
        int b = 10;
        fillArray(array, a, b);
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    // reverse array
    public static void reverseArray(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length/2 ; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
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
