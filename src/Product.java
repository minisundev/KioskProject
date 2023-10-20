public class Product extends Menu {
    private double price;

    public Product() {
    }

    public Product(String name, String desc, double price) {
        super(name, desc);
        this.price = price;
    }
    public void printDesc() {
        System.out.println(super.getName() + "     | W " + this.getPrice() + " | " + super.getDesc());
    }

    public double getPrice() {
        return this.price;
    }
}