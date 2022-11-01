package Review05;
interface Drivable{ //we achieve 100% abstraction
    //by default all variables public static final
    boolean DRIVES=true;
    //WE CANNOT HAVE A CONSTRUCTOR

    void breaks(); // by default all methods are public and abstract
}
interface Vehicle{
    void haveMotor();
    //from Java8 we can have static methods and default methods.

    default void haveBreak(){
        System.out.println("All vehicle have break");
    }
    static void honk(){
        System.out.println("all vehicles honk");
    }
}
// with help of the abstract class we can achieve 0 to 100% abstraction
public abstract class Car {
    String color, make, model; //instance variables
    public static final int WHEELS=4;

    public  Car(String make, String model, String color){
        this.make=make;
        this.model=model;
        this.color=color;
    }
    void drive(){//implemented method
        System.out.println("All cars can drive");
    }
    abstract void start(); //unimplemented method
    abstract void stop();
}
class Tesla extends Car implements Drivable, Vehicle{
    public Tesla(String make, String model, String color) {
        super(make, model, color);
    }

    @Override
    public void start() {
        System.out.println(make+" starts automatically");
    }

    @Override
    public void stop() {
        System.out.println(make+" stops when we press break");
    }
    public void charge(){
        System.out.println("You need to charge your "+make);
    }

    @Override
    public void breaks() {
        System.out.println(make+" can break.");
    }

    @Override
    public void haveMotor() {
        System.out.println(make+ " have motor.");
    }

    @Override
    public void haveBreak() {
        Vehicle.super.haveBreak();
    }
}
class Test{
    public static void main(String[] args) {
        Car car=new Tesla("Tesla", "X", "Yellow"); //new Car(); -> is not possible, as we cannot create a parent class object directly, this is why we create it indirectly through the child class
        car.drive();
        car.start();
        car.stop();
        //car.charge() -> cannot use by Parent class

        System.out.println("----------------------------");
        Tesla tesla=new Tesla("Tesla", "X", "Green");
        tesla.drive();
        tesla.start();
        tesla.stop();
        tesla.charge();
        tesla.haveBreak();




    }
}
