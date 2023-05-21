public class Account {
    private int accountNumber;
    private int accountBalance;
    private String customerName;
    private String eMail;
    private String phoneNumber;

    public Account() {
        this(0,2,"Empty","Empty","Empty");
        System.out.println("Empty constructor is called");
    }
    public Account(int accountNumber,int accountBalance, String customerName, String eMail, String phoneNumber) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        System.out.println("This is " + this.customerName + "'s account.");
    }

    public Account(String customerName,String eMail,String phoneNumber) {
        this(0,0,customerName,eMail,phoneNumber);
    }

    public void displayAccount() {
        System.out.println("Customer Name:" + this.customerName + "\n"+
                "Balance is: " + this.accountBalance  + "\n" +
                "eMail is: " + this.eMail);

    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int money) {
        this.accountBalance += money;
        System.out.println("Your new balance is " + this.accountBalance);
    }
    public void withdrawFunds(int money) {
        if (this.accountBalance < money) {
            System.out.println("You cant do this. Your money is not enough");
        } else {
            this.accountBalance -= money;
            System.out.println("Your new balance is " + this.accountBalance);
        }

    }



}
