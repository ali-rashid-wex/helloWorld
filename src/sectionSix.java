public class sectionSix {

    public static void main(){
        Car bmw = new Car();
        Car volkswagen = new Car();

        bmw.setAll(3, 4, "M4", "3.0 litre", "White");
        volkswagen.setAll(5, 4, "Golf R", "2.0 litre", "Gray");

        System.out.println("BMW model: " + bmw.getModel());
        System.out.println("BMW engine: " + bmw.getEngine());
        System.out.println("BMW colour: " + bmw.getColour());

        System.out.println("--------------------------------------");

        System.out.println("Volkswagen model: " + volkswagen.getModel());
        System.out.println("Volkswagen engine: " + volkswagen.getEngine());
        System.out.println("Volkswagen colour: " + volkswagen.getColour());
    }

}
