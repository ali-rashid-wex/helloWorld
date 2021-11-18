public class sectionSix {

    public static void main(){

        //checkCarClass();

        checkBankAccountClass();
    }

    public static void checkBankAccountClass(){

        bankAccount account1 = new bankAccount("wexinc1", 100, "Ali Abbas Rashid", "aliabbasrashid@gmail.com", "07368658235");

        System.out.println("--------------------------------------");
        System.out.println(account1.getAccountNumber());
        System.out.println(account1.getCustomerName());
        System.out.println(account1.getBalance());
        System.out.println("--------------------------------------");

        account1.deposit(200);

        System.out.println("--------------------------------------");

        account1.withdraw(500);

        System.out.println("--------------------------------------");

        account1.withdraw(50);

        System.out.println("--------------------------------------");
    }

    public static void checkCarClass(){
        Car bmw = new Car();
        Car volkswagen = new Car();

        bmw.setAll(3, 4, "M4", "3.0 litre", "White");
        volkswagen.setAll(5, 4, "Golf R", "2.0 litre", "Gray");

        System.out.println("BMW model: " + bmw.getModel());
        System.out.println("BMW engine: " + bmw.getEngine());
        System.out.println("BMW colour: " + bmw.getColour());
        System.out.println("BMW doors: " + bmw.getDoors());
        System.out.println("BMW wheels: " + bmw.getWheels());

        System.out.println("--------------------------------------");

        System.out.println("Volkswagen model: " + volkswagen.getModel());
        System.out.println("Volkswagen engine: " + volkswagen.getEngine());
        System.out.println("Volkswagen colour: " + volkswagen.getColour());
        System.out.println("Volkswagen doors: " + volkswagen.getDoors());
        System.out.println("Volkswagen wheels: " + volkswagen.getWheels());
    }

}
