package homework_47.doctors_spec;

import java.util.Arrays;

public class Doctors {
    String name;
    String[] specialties; // специализация

    public Doctors(String name, String[] specialties) {
        this.name = name;
        this.specialties = specialties;
    }

    public String getName() {
        return name;
    }

    public String[] getSpecialties() {
        return specialties;
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "name='" + name + '\'' +
                ", specialties=" + Arrays.toString(specialties) +
                '}';
    }
}
