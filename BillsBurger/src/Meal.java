public class Meal {
    private Hamburger hamburger;
    private Drink drink;
    private Side side;

    public Meal() {
        this.hamburger = new Hamburger();
        this.drink = new Drink();
        this.side = new Side();
    }

    public Meal(Hamburger hamburger, Drink drink, Side side) {
        this.hamburger = hamburger;
        this.drink = drink;
        this.side = side;
    }

    public int calculatePrice() {
        int totalPrice = this.hamburger.calculatePrice() + this.side.getPrice() + this.drink.calculatePrice();
        return totalPrice;
    }

    public void display() {
        System.out.println("You ordered");
        hamburger.display();
        System.out.println("Hamburger additional topic : " + this.hamburger.getAdditionalTopic().getType() + " and price is "
                + this.hamburger.getAdditionalTopic().getPrice());
        drink.display();
        side.display();
        System.out.println("Your total debt is " + calculatePrice());
    }


}
