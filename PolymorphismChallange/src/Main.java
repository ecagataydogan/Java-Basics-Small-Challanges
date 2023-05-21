public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW E60 2008");
        runRace(car);
        Car gasPoweredCar = new GasPoweredCar("Golf IV LPG",12,4);
        runRace(gasPoweredCar);


    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
