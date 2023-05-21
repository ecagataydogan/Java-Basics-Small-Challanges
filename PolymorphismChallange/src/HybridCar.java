public class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinder;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinder) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinder = cylinder;
    }
}
