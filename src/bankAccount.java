public class bankAccount {

    private String accountNumber, customerName, email, phoneNumber;
    private int balance;

    public void setAll(String accountNumber, int balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public int getBalance(){
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

    public void deposit(int funds){
        System.out.println("Balance: " + this.balance);

        if(funds < 0){
            System.out.println("Please enter a valid amount of funds");
            return;
        }

        this.balance += funds;
        System.out.println("Deposit: " + funds);
        System.out.println("New balance: " + this.balance);
    }

    public void withdraw(int funds){
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
