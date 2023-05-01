public class Product {
    private String name;
    private int id, quantity;

    public Product(String name, int id, int quantity) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }
    //write the to string function here

    @Override
    public String toString() {
        return "Product" +
                "Name='" + name + '\'' +
                ", ID=" + id +
                ", Quantity=" + quantity +
                '}';
    }


}

