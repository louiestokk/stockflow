import java.math.BigDecimal;

public class Phone extends Product{
    public int model;
    public Phone(long id, String name, String sku, BigDecimal purchasePrice, BigDecimal sellingPrice, int quantity,String brand, int model) {
        super(id, name, sku, purchasePrice, sellingPrice, quantity, brand);
        this.model = model;
    }

    @Override
    public void printRecipe() {
        System.out.println(getProductInfo());
        System.out.println(getBrand() + " " + getName() + " " +  model + " model");
    }
}
