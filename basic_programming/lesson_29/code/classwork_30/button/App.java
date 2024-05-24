package classwork_30.button;

public class App {
    public static void main(String[] args) {
        Action action = new Action() {
            @Override
            public void perform() {
                System.out.println("Мир делается лучше, подожди немного.....");
                System.out.println("Мир стал лучше.");
            }
        };
        Button button = new Button("Сделать мир лучше", action);

        button.click();
    }
}
