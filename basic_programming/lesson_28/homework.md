# Homework

1. Создайте интерфейс ArrayList с методами `void add(Car value)`, `Car get(int index)` и `Car remove(int index)`
2. Создать класс CarArrayList для хранения объектов типа Car (класс указан снизу). Класс CarArrayList должен реализовывать интерфейс ArrayList 
3. Создать класс Main и в его методе main создать объекты машин и заполнить ими список используя CarArrayList
4. Загрузить на гитхаб (желательно) все в том же репозитории AITWorks (но можно и в другой репозиторий на гитхабе)
5. Отправить ссылку в личку в слаке

```java
public class Car {
    public String vendor;
    public int builtYear;

    public Car(String vendor, int builtYear) {
        this.vendor = vendor;
        this.builtYear = builtYear;
    }
    
    @Override
    public String toString() {
        return "Car{" +
                "vendor='" + vendor + '\'' +
                ", builtYear=" + builtYear +
                '}';
    }
}
```