package classwork_29;

public class OuterClass {
    private static String staticField = "Статическое поле";
    private String field = "Нестатическое поле";
    private StaticNestedClass staticNestedClassObject;
    private static InnerClass innerClassObject;


    // Статический вложенный класс
    static class StaticNestedClass {
        private static String nestedStaticField = "Вложенное статическое поле";
        private String nestedField = "Вложеное поле";

        void display() {
            // Обращение к статическому полю внешнего класса
            System.out.println(staticField);

            // Обращение к нестатическому полю внешнего класса
            // System.out.println(field); // ошибка, т.к. нельзя

            // Обращение к полям самого StaticNestedClass
            // происходит обычном образом
            System.out.println(nestedStaticField);
            System.out.println(nestedField);

            // вывести статическое поле внутреннего класса,
            // допустимое поведение только в последних версиях джавы
            // System.out.println(OuterClass.InnerClass.innerStaticField)

            // вывести поле внутреннего класса
            // нереализуемо честным образом
            System.out.println(OuterClass.innerClassObject.innerField);

        }
    }

    class InnerClass {
        private String innerField = "Внутреннее поле";
        // Нельзя создать статическое поле во внутреннем классе, допустимо в последних версиях джавы
        // private static String innerStaticField = "Внутреннее статическое поле";

        void display() {
            // Обращение к статическому полю внешнего класса
            System.out.println(staticField);

            // Обращение к нестатическому полю внешнего класса
            System.out.println(field);

            // Обращение к нестатическому полю экземпляра класса InnerClass в полной форме
            System.out.println(this.innerField);

            // Обращение к статическому полю внешнего класса в полной форме
            System.out.println(OuterClass.staticField);

            // Обращение к нестатическому полю экзепляра внешнего класса в полной форме
            System.out.println(OuterClass.this.field);

            // вывести статическое поле вложенного статического класса
            System.out.println(OuterClass.StaticNestedClass.nestedStaticField);

            // вывести поле вложенного статического класса
            System.out.println(OuterClass.this.staticNestedClassObject.nestedField);
        }
    }
}
