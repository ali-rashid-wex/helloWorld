public class helloWorld {

    public static void main(String[] args){
        //myFirst();
        //primitiveTypes();
        //primitiveTypesChallenge();
        floatAndDouble();
    }

    private static void floatAndDouble() {
        System.out.println("-------------------");
        System.out.println("FLOAT:");

        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Minimum: " + myMinFloat);
        System.out.println("Maximum: " + myMaxFloat);

        System.out.println("-------------------");

        System.out.println("DOUBLE:");

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("Minimum: " + myMinDouble);
        System.out.println("Maximum: " + myMaxDouble);

        System.out.println("-------------------");
    }

    private static void primitiveTypesChallenge() {
        byte byteNum = 23;
        short shortNum = 293;
        int intNum = 345;
        long longNum = 50000L + (long)(10 * (byteNum + shortNum + intNum));
        System.out.println(longNum);
    }

    private static void primitiveTypes() {
        //integers
        System.out.println("-------------------");

        System.out.println("INTEGERS:");
        int myValue = 10000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Minimum: " + myMinValue);
        System.out.println("Maximum: " + myMaxValue);
        System.out.println("Broken Minimum: " + (myMinValue - 1));
        System.out.println("Broken Maximum: " + (myMaxValue + 1));

        System.out.println("-------------------");

        //bytes
        System.out.println("BYTES:");
        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        System.out.println("Minimum: " + myMinByte);
        System.out.println("Maximum: " + myMaxByte);

        System.out.println("-------------------");

        //short
        System.out.println("SHORT:");
        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;
        System.out.println("Minimum: " + myMinShort);
        System.out.println("Maximum: " + myMaxShort);

        System.out.println("-------------------");

        //long
        System.out.println("LONG:");
        long myLongValue = 100L;
        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        System.out.println("Minimum: " + myMinLong);
        System.out.println("Maximum: " + myMaxLong);
        long bigLongLit = 2_147_483_647_234L;
        System.out.println("Big Long Literal Number: "+ bigLongLit);

        System.out.println("-------------------");

        //casting
        System.out.println("CASTING:");

        byte myNewByte = (byte) (myMinByte / 2);
        System.out.println("Casted New Byte: " + myNewByte);

        short myNewShort = (short) (myMinShort / 2);
        System.out.println("Casted New Short: " + myNewShort);

        System.out.println("-------------------");
    }

    private static void myFirst(){
        System.out.println("-------------------");
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
