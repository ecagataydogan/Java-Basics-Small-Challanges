public class Main {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator(true);
        DishWasher dishWasher = new DishWasher(true);
        CoffeeMaker coffeeMaker = new CoffeeMaker(true);
        SmartKitchen smartKitchen = new SmartKitchen(refrigerator,dishWasher,coffeeMaker);
        smartKitchen.doKitchenWork();
        smartKitchen.setKitchenState(false,false,false);
        smartKitchen.doKitchenWork();
        ;
    }
}
