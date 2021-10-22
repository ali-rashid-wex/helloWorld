public class helloWorld {

    public static void main(String[] args){
        myFirst();
        System.out.println("-------------------");
        primitiveTypes();
    }

    private static void primitiveTypes() {
        int myValue = 10000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Minimum: " + myMinValue);
        System.out.println("Maximum: " + myMaxValue);
    }

    public static void myFirst(){
        System.out.println("Hello, Ali");

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        System.out.println(myTotal);

        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }
}
