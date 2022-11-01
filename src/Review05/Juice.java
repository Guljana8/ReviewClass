package Review05;

class Drink{
    void drink(){
        System.out.println("drinking method");
    }
    // -> final cannot be overriden
    protected final void enjoy(){
        System.out.println("we enjoy drinking water");
    }
}
/*CE: The type Juice cannot subclass the final class Drink
public class Juice extends Drink{

   //  CE: Cannot override the final method from Drink
    public void enjoy(){
        System.out.println("We enjoy drinking juice");
    }
 }
    */

