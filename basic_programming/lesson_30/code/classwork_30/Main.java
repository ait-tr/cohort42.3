package classwork_30;


class MyBestClass implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Hello from MyBestClass");
    }

    @Override
    public void sayGoodBye() {
        System.out.println("Good bye from MyBestClass");
    }
}


public class Main {
    public static void main(String[] args) {
        Greeting myObject2 = new MyBestClass();
        myObject2.sayHello();
        myObject2.sayGoodBye();
    }
}


class AnonClassBasedOnRegularClass {
    public static void main(String[] args) {
        MyBestClass obj = new MyBestClass() {
            @Override
            public void sayHello() {
                System.out.println("Hello from anon class");
            };
        };

        obj.sayHello();
        obj.sayGoodBye();
    }
}