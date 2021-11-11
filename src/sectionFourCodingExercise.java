import java.math.RoundingMode;
import java.text.DecimalFormat;

public class sectionFourCodingExercise {
    private static DecimalFormat df = new DecimalFormat("0.000");
    public static void main(){
        /*
        System.out.println(toMilesPerHour((double) 3.218));
        System.out.println(toMilesPerHour((double) 937207.4938));
        System.out.println(toMilesPerHour((double) 1.609));
        System.out.println(toMilesPerHour((double) -239));
        System.out.println(toMilesPerHour((double) 0));
        */

        /*
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
        */

        /*
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        */

        //System.out.println(isLeapYear(1600));

        //System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));

        System.out.println(hasTeen(122, 55, 32));
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour <= 0){
            return (long) -1;
        }
        long converted = (long) (kilometersPerHour / 1.609);
        return Math.round(converted);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else {
            int megaByte = Math.round(kiloBytes/1024);
            int remainder = Math.round(kiloBytes%1024);
            System.out.println(kiloBytes + " KB = " + megaByte + " MB and " + remainder + " KB");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if ((hourOfDay > 23) || (hourOfDay < 0)){
            return false;
        }
        if ((barking && hourOfDay < 8) || (barking && hourOfDay > 22)){
            return true;
        }
        return false;
    }

    public static boolean isLeapYear(int year){
        if ((year > 9999) || (year < 1)){
            return false;
        }

        boolean isLeap = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        return isLeap;
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        df.setRoundingMode(RoundingMode.DOWN);
        String strNum1 = df.format(num1), strNum2 = df.format(num2);
        if (strNum1.equals(strNum2)){
            return true;
        }
        return false;
    }

    public static boolean hasEqualSum(int num1, int num2, int num3){
        if ((num1 + num2) == num3){
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int num1, int num2, int num3){
        if ((num1 >= 13) && (num1<=19)){
            return true;
        }
        if ((num2 >= 13) && (num2<=19)){
            return true;
        }
        if ((num3 >= 13) && (num3<=19)){
            return true;
        }

        return false;
    }

    public static boolean isTeen(int num1){
        if ((num1 >= 13) && (num1 <= 19)){
            return true;
        }

        return false;
    }
}
