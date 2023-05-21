public class Customer {
    private String name;
    private double creditLimit;
    private String eMailAddress;

    public Customer(String name, double creditLimit, String eMailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.eMailAddress = eMailAddress;
    }

    public Customer() {
        this("emptyName",5000,"emptyCustomer@gmail.com");


    }
    public Customer(String name, String eMailAddress) {

        this(name,10000,eMailAddress);
    }

    public String getName() {
        return this.name;
    }
    public String geteMailAddress() {
        return this.eMailAddress;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }


}
