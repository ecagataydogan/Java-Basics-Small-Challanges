public class Contact {
    private String name,phoneNumber;
    public Contact(String name,String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;

    }

    public String getName() {
        return this.name;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public static Contact createContact(String personName,String phoneNumber) {
        return new Contact(personName,phoneNumber);
    }
}
