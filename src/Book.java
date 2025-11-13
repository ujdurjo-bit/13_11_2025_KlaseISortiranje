public class Book extends Product{
    private String author;
    private String isbn;

    public Book(int productID, String name, double price, String author, String isbn) {
        super(productID, name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public String getDescription() {
        return "Knjiga: " + name + ", " + author + ", ISBN:" + isbn;
    }
}
