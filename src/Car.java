public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setAll(int doors, int wheels, String model, String engine, String colour){
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.colour = colour;
    }

    public int getDoors(){
        return this.doors;
    }

    public int getWheels(){
        return this.wheels;
    }

    public String getModel(){
        return this.model;
    }

    public String getEngine(){
        return this.engine;
    }

    public String getColour(){
        return this.colour;
    }
}