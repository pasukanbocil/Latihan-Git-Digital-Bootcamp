package AccessModifier.childs;
import AccessModifier.parents.Person;

public class Doctor extends Person {

    public String specialist;

    public Doctor(){

    }

    public Doctor(String name, String address, String specialist) {
        super(name, address);
        this.specialist = specialist;
    }

    public void surgery(){
        System.out.println("I can surgery operation patients");
    }
    public void greeting(){
        System.out.println("Hello my name is " + name + ".");
        System.out.println("I, come from " + address + ".");
        System.out.println("My occupation is a " + specialist + " doctor.");
    }
}