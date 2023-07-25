package Abstract_Class_Method;

import Abstract_Class_Method.childs.Item;
import Abstract_Class_Method.parents.Product;

public class AppMain {
    public static void main(String[] args) {
        // Membuat objek item
        Product product1 = new Item("Lenovo Thinkpad", 15000000);
        // Memanggil method printingInformation()
        product1.printingInformation();
    }
    
}
