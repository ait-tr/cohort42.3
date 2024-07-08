package classwork19.beverages;

import java.time.LocalDate;

public class Milk {
    private String milkType; // Тип молока (например, коровье, миндальное, соевое)
    private double fatPercentage; // Процент жирности
    private LocalDate expirationDate; // Дата истечения срока годности

    public Milk(String milkType, double fatPercentage, LocalDate expirationDate) {
        this.milkType = milkType;
        this.fatPercentage = fatPercentage;
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "milkType='" + milkType + '\'' +
                ", fatPercentage=" + fatPercentage +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
