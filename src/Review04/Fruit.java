package Review04;

public class Fruit {
    protected String name;
    String shape;
    private String color;
    public static boolean fresh;
    Fruit(String name){
        this.name=name;
    }
    Fruit (String name, String shape, String color){
        this(name);
        this.shape=shape;
        this.color=color;
        double price;
    }
    void grow(){
        System.out.println("All fruits grow fresh "+fresh);
    }

    public static void havePeel(){
        System.out.println("All fruits need to b peeled");
    }
    protected void haveBenefits(){
        System.out.println("All fruits good for your health");
    }
}
class Apple extends Fruit {
    String size;
    String taste;
    double price;

    Apple(String name, String shape, String color, String size) {
        super(name, shape, color);
        this.size = size;
    }

    Apple(String name, String shape, String color, String size, String taste, double price) {
        this(name, shape, color, size);
        this.taste = taste;
        this.price = price;
    }

    //Overloading - methods with same name within same class.
    /*How to achieve Overloading? There are 2 ways:
     * 1. Change number of parameters,
     * 2. Change type of the parameters.
     *
     * In Overloading - method signature MUST BE DIFFERENT
     * We do not care about return type
     * method signature = name+parameters
     */
    void makeJuice() {
        System.out.println("from " + name + " we can make " + taste + " juice");
    }

    /* this is not overloading -> signature is same
		String makeJuice() {
		}
	*/
    void makeJuice(String fruit) {
        System.out.println("We can have juice from " + name + " mixed with " + fruit);
    }


    public static void main(String[] args) {
        Apple app=new Apple("apple","circle", "red", "big" );
        //app.color; not visible since it access mod. is PRIVATE
        System.out.println(app.name);
        System.out.println(app.shape);
        System.out.println(Fruit.fresh);
        System.out.println(Apple.fresh);

        app.grow();
        app.haveBenefits();

    }
}
class Banana extends Fruit{
    String origin;

    Banana(String name, String shape, String color, String origin){
        super(name, shape, color);
        this.origin=origin;
    }
    
    void makeSmothie(){
        System.out.println("from "+name+" we get tasty smoothie");
    }
    /* When Child class has the same method name as Super class -
    *  Overriding - 2 methods with same name BUT inside Different classes.
    *  How to Override?
    *  1. Method signature MUST be same
    *  2. Return type MUST BE SAME!
    *  3. Access Modifier(VISIBILITY) MUST be same or MUST be higher!
     */
    protected void grow(){
        System.out.println(name+" grows fast and fresh");
    }
    void makePie(){
        System.out.println("Banana pie is delicious");
    }
    public static void havePeel(){
        System.out.println("Banana is very easy to peel");
    }

    public static void main(String[] args) {
        Banana ban=new Banana("banana", "banana shape", "yellow", "Ecuador");
        ban.haveBenefits();//Fruit
        ban.makeSmothie(); //Banana
        ban.grow(); //Banana
        ban.havePeel();

        System.out.println("-----------------------------------");
        //RUN-TIME POLYMORPHISM
        Fruit fruit=new Banana("banana", "banana shape", "green", "Afria");
        fruit.grow(); //RUN-TIME POLYMORPHISM
        fruit.haveBenefits(); //RUN-TIME POLYMORPHISM

        /* static method in parent class and static method in child class we call it METHOD HIDING
         * and always static executed from the Parent class
         */
        // when child class have same static method as parent class
        // we are not achieving overriding.
        // this calls method hiding
        fruit.havePeel();
    }
}