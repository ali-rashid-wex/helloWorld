public class sectionFive {

    public static void main(){
        int value = 5;
        char charValue = 'C';

        swtichStatements(value, charValue);
    }

    public static void swtichStatements(int val, char charVal){
        System.out.println("--------------------------------------");

        switch(val){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3, 4 or 5");
                break;
            default:
                System.out.println("Value was not 1, 2, 3, 4 or 5");
                System.out.println("Value is: " + val);
                break;
        }

        System.out.println("--------------------------------------");

        switch(charVal){
            case 'A': case 'a':
                System.out.println("Character Value was A or a");
                break;
            case 'B': case 'b':
                System.out.println("Character Value was B or b");
                break;
            case 'C': case 'c':
                System.out.println("Character Value was C or c");
                break;
            case 'D': case 'd':
                System.out.println("Character Value was D or d");
                break;
            case 'E': case 'e':
                System.out.println("Character Value was E or e");
                break;
            default:
                System.out.println("Character not found");
                break;
        }
        
        System.out.println("--------------------------------------");
    }
}
