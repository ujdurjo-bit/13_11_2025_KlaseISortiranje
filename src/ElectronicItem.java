public class ElectronicItem extends Product {
    private int warrantyMonths;

    public ElectronicItem(int productID, String name, double price, int warrantyMonths) {
        super(productID, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getDescription() {
        return "Elektronički uređaj: " + name + " - jamstvo: " + warrantyMonths + " mjeseci:";
    }

}
