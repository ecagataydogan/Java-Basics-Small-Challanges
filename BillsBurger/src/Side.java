public class Side {
    private String type;
    private int price;

    public Side() {
        this.type = "Fries";
        this.price = 5;
    }

    public Side(String type, int price) {
        this.type = type;
        this.price = price;
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

    public void display() {
        System.out.println("Side : " + this.getType() + " and price is " + this.getPrice());
    }
}
