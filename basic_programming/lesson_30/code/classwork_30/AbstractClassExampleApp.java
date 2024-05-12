package classwork_30;


abstract class Person {
    abstract void sayHello();
    abstract void sayGoodBye();
}

public class AbstractClassExampleApp {
    public static void main(String[] args) {
        Person person = new Person() {
            @Override
            void sayHello() {
                System.out.println("Hello from anon class");
            }

            @Override
            void sayGoodBye() {
                System.out.println("Good bye from anon class");
            }
        };

        person.sayHello();
        person.sayGoodBye();
    }
}
