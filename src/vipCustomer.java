public class vipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public vipCustomer(){
        this("Default name", 100.00, "Default Email");
    }

    public vipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown email");
    }

    public vipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
