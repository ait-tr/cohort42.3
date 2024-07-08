package classwork19.beverages;

public class Wine extends Beverages{

    private String grapeVariety; // Сорт винограда
    private int vintageYear; // Год урожая
    private String region; // Регион производства
    private double alcoholPercentage; // Процент содержания алкоголя

    public Wine(double volume, String packingType, double price, String grapeVariety, int vintageYear, String region, double alcoholPercentage) {
        super(volume, packingType, price);
        this.grapeVariety = grapeVariety;
        this.vintageYear = vintageYear;
        this.region = region;
        this.alcoholPercentage = alcoholPercentage;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "grapeVariety='" + grapeVariety + '\'' +
                ", vintageYear=" + vintageYear +
                ", region='" + region + '\'' +
                ", alcoholPercentage=" + alcoholPercentage +
                '}';
    }
}
