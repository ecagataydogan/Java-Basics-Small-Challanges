public class Drink {
    private String type;
    private String size;
    private int price;

    public Drink() {
        this.type = "Cola";
        this.size = "Small";
        this.price = 1;
    }

    public Drink(String type, String size, int price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public int calculatePrice() {
        int totalPrice = this.size == "Small" ? this.price : this.price * 2;
        return totalPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void display() {
        System.out.println("Drink : " + this.getType() + " with " + this.getSize() + " boy" + " and price is " + this.calculatePrice());
    }
}
