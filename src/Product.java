public abstract class Product implements Comparable<Product>{
    int productID;
    String name;
    double price;

    public Product(int productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public abstract String getDescription();

    public String getProductInfo() {
        return "ID: " + productID + ", Naziv: " + name + ", Cijena: " + price + " EUR";
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(price, o.price);

    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
