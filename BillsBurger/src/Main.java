public class Main {
    public static void main(String[] args) {
        Meal esoMeal = new Meal();
        esoMeal.display();
        System.out.println("--------------------------");
        Topic topic = new Topic("Mayoinesse", 2);
        Hamburger hamburger = new Hamburger("McDonalds",30, topic);
        Drink drink = new Drink("Icetea","Big",3);
        Side side = new Side("Salad",5);
        Meal akaMeal = new Meal(hamburger,drink,side);
        akaMeal.display();


    }


}
