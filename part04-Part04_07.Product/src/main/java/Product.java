public class Product {
    private String name;
    private double price;
    private double quantity;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }
    public void printProduct(){
        System.out.println(name + ", price " + price + " , "+ quantity + " pcs");
    }
}
