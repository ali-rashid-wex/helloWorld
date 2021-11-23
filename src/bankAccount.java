public class bankAccount {

    private String accountNumber, customerName, email, phoneNumber;
    private double balance;

    public bankAccount(){
        this("243435", 0.00, "Default name", "Default email address", "Default phone number");
        System.out.println("Empty Constructor called");
    }

    public bankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAll(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void deposit(double funds){
        System.out.println("Balance: " + this.balance);

        if(funds < 0){
            System.out.println("Please enter a valid amount of funds");
            return;
        }

        this.balance += funds;
        System.out.println("Deposit: " + funds);
        System.out.println("New balance: " + this.balance);
    }

    public void withdraw(double funds){
        System.out.println("Balance: " + this.balance);

        if(funds < 0){
            System.out.println("Please enter a valid amount of funds");
            return;
        }

        if(funds > this.balance){
            System.out.println("Insufficient balance to withdraw " + funds);
            return;
        }

        this.balance -= funds;
        System.out.println("Withdraw: " + funds);
        System.out.println("New balance: " + this.balance);
    }
}
