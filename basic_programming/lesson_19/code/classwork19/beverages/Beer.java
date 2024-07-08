package classwork19.beverages;

public class Beer extends Beverages{
    private String name;
    private double alcoholPercentage; // Процент содержания алкоголя
    private String beerType; // Тип пива (например, lager, ale, stout)
    private String originCountry; // Страна происхождения

    public Beer(double volume, String packingType, double price, String name, double alcoholPercentage, String beerType, String originCountry) {
        super(volume, packingType, price);
        this.name = name;
        this.alcoholPercentage = alcoholPercentage;
        this.beerType = beerType;
        this.originCountry = originCountry;
    }


}
