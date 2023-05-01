import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Warehouse wh = new Warehouse();
        int ch = 0;
        while(ch<=4){
            System.out.println("Menu:");
            System.out.println("\t1. Add product");
            System.out.println("\t2. View products");
            System.out.println("\t3. Search by name");
            System.out.println("\t4. Search by ID");
            System.out.println("\t5. Exit\n");

            System.out.println("Enter your choice: ");
            ch = scanner.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.println("\nEnter Product Details:");
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter quantity: ");
                    int quant = scanner.nextInt();
                    Product p = new Product(name, id, quant);
                    wh.AddProduct(p);
                    System.out.println("\n");
                }

                case 2 -> {
                    System.out.println("\n");
                    System.out.println("Entered Items In Inventory: ");
                    for (Product product : wh.getProducts()) {
                        System.out.println(product);
                    }
                }
                case 3 -> {
                    System.out.print("Enter Name to search the product: ");
                    String searchName = scanner.next();
                    wh.SearchByName(searchName);
                }
                case 4 -> {
                    System.out.println("Enter Product Id to search: ");
                    int searchId = scanner.nextInt();
                    wh.searchById(searchId);
                }
            }
        }
    }
}
