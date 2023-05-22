public class Topic {
    private String type;
    private int price;

    public Topic() {
        this.type = "None";
        this.price = 0;
    }

    public Topic(String type, int price) {
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

}
