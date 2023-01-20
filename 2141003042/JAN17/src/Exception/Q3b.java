package Exception;

public class Q3b {
    public static void main(String[] args) {
        Bike A = new Bike();
        Bike B = (Bike) new Vehicle();
    }
}
class Vehicle{
    public Vehicle(){
        System.out.println("Vehicle class");
    }
}
class Bike extends Vehicle{
    public Bike(){
        super();
        System.out.println("Bike class");
    }
}