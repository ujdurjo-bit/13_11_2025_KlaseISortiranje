import java.util.ArrayList;
import java.util.Collections;

public class InventoryDemo {
    public static void  main (String[] args) {

        Book book1 = new Book( 12, "Lonesome Dove", 34, "Larry McMurtry",  "97806");
        Book book2 = new Book( 47, "The Way of Kings", 78, "Brandon Sanderson",  "97807");

        ElectronicItem elec1 = new ElectronicItem(89, "Računalo", 570, 36);
        ElectronicItem elec2 = new ElectronicItem(25, "Powerbank", 15, 12);

        ArrayList<Product> products = new ArrayList<>();

        products.add(book1);
        products.add(book2);
        products.add(elec1);
        products.add(elec2);

        System.out.println("Prije sortiranja: ");
        for (Product PrD : products) {
            System.out.println(PrD.getProductInfo());
            System.out.println(PrD.getDescription());

        }

        Collections.sort(products);
        System.out.println("Nakon sortiranja: ");
        for (Product PrD : products ) {
            System.out.println(PrD);
        }




    }
}
