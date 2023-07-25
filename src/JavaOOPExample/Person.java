package JavaOOPExample;

public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // constructor default
    Person(){

    }

    // constructor parameter
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    // method void
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name + ".");
    }
    //mehtod retrun value (mengembalikan nilai)
    String sayAddres(){
        return "I, come from " +  address + ".";
    }
}
