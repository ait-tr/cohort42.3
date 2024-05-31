package classwork_33.cats;

import java.util.Objects;

public class Cat implements Comparable<Cat>{
    // этот метод сравнивает текущий объект и Cat o
    @Override
    public int compareTo(Cat o) {
        int res = this.age - o.age; // сравнение объектов по полю age
        return res;
    }

    private int id;
        private  String name;
        private String breed;
        private int age;
        private double weight;


    public Cat(int id, String name, String breed, int age, double weight) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return id == cat.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
