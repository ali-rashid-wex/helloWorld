public class calculator {

    private floor Floor;
    private carpet Carpet;

    public calculator(floor Floor, carpet Carpet){
        this.Floor = Floor;
        this.Carpet = Carpet;
    }

    public double getTotalCost() {
        return (Floor.getArea() * Carpet.getCost());
    }
}
