package JavaOOPExample;

public class MainApp {
    public static void main(String[] args) {
        Person person2 = new Person();
        person2.name = "Joko";
        person2.address = "Surabaya";
        
        person2.sayHello("Padepokan 79");
        System.out.println(person2.sayAddres());
    }
}
