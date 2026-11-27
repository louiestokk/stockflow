import java.math.BigDecimal;

public class Laptop extends Product{
    private int screenSize;
    public Laptop(long id, String name, String sku, BigDecimal purchasePrice, BigDecimal sellingPrice, int quantity, String brand, int screenSize) {
        super(id, name, sku, purchasePrice, sellingPrice, quantity, brand);
        this.screenSize = screenSize;
    }


    @Override
    public void printRecipe() {
        System.out.println(getProductInfo());
        System.out.println(getBrand() + " " + getName() + " " +  screenSize + " screen width");
    }
}

