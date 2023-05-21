public class SmartKitchen {
    private Refrigerator iceBox;
    private DishWasher dishWasher;
    private CoffeeMaker brewMaker;

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setIceBox(Refrigerator iceBox) {
        this.iceBox = iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setDishWasher(DishWasher dishWasher) {
        this.dishWasher = dishWasher;
    }

    public CoffeeMaker getBrewMaker() {
        return brewMaker;
    }

    public void setBrewMaker(CoffeeMaker brewMaker) {
        this.brewMaker = brewMaker;
    }

    public SmartKitchen(Refrigerator iceBox, DishWasher dishWasher, CoffeeMaker brewMaker) {
        this.iceBox = iceBox;
        this.dishWasher = dishWasher;
        this.brewMaker = brewMaker;
    }

    public void addWater() {
        this.brewMaker.setHasWorkToDo(true);

    }

    public void pourMilk() {
        this.iceBox.setHasWorkToDo(true);

    }

    public void loadDishwasher() {
        this.dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean hasWorkToDoRef,boolean hasWorkToDoDish, boolean hasWorkToDoCoffee) {
        this.dishWasher.setHasWorkToDo(hasWorkToDoDish);
        this.iceBox.setHasWorkToDo(hasWorkToDoRef);
        this.brewMaker.setHasWorkToDo(hasWorkToDoDish);
    }

    public void doKitchenWork() {
        this.iceBox.orderFood();
        this.brewMaker.brewCoffee();
        this.dishWasher.doDishes();
    }
}
