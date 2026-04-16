package Classes.Store;

public class Store {
    public String productType;
    public int inventoryCount;
    double inventoryPrice;

    public Store(String product, int count, double price){
        this.productType = product;
        this.inventoryCount = count;
        this.inventoryPrice = price;
    }
}
