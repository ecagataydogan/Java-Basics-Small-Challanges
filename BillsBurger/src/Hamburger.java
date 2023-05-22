public class Hamburger {
    private String type;
    private int price;
    private Topic additionalTopic;


    public Hamburger() {
        this.type = "Bill";
        this.price = 25;
        this.additionalTopic = new Topic();
    }


    public Hamburger(String type, int price, Topic additionalTopic) {
        this.type = type;
        this.price = price;
        this.additionalTopic = additionalTopic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   


    public Topic getAdditionalTopic() {
        return additionalTopic;
    }

    public void setAdditionalTopic(Topic additionalTopic) {
        this.additionalTopic = additionalTopic;
    }

    public int calculatePrice() {
        int totalPrice = this.price + additionalTopic.getPrice();

        return totalPrice;
    }
    public void display() {
        System.out.println("Hamburger : " + this.getType() + " and price is " + this.calculatePrice());
    }

}
