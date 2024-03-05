package classwork;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'a'; // задаем первую букву алфавита
        int code = (int) letter; // выясняем ее код с помощью преобразования типа
        for (int i = 0; i < 26; i++) {
            letter = (char) (code + i); // обратное преобразование кода в букву
            System.out.println(letter);
        }
    }
}
