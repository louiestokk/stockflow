import java.math.BigDecimal;

public class Product {
    private static final String NAME = "StockFlow";
    private long id;
    private String name;
    private String sku;
    private BigDecimal purchasePrice;
    private BigDecimal sellingPrice;
    private int quantity;

    public Product(long id, String name, String sku, BigDecimal purchasePrice, BigDecimal sellingPrice, int quantity){
        this.id = id;
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Product name cannot be empty.");
        }
        this.name = name;
        if (sku == null || sku.isBlank()){
            throw new IllegalArgumentException("Product SKU cannot be empty.");
        }
        this.sku = sku;
        if( purchasePrice == null || purchasePrice.compareTo(BigDecimal.ZERO)<0){
            throw new IllegalArgumentException("Purchase price cannot be negative or null.");
        }
        this.purchasePrice = purchasePrice;
        if (sellingPrice == null || sellingPrice.compareTo(BigDecimal.ZERO)<0){
            throw new IllegalArgumentException("Selling price cannot be negative or null.");
        }
        this.sellingPrice = sellingPrice;
        if(quantity < 0){
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        this.quantity = quantity;
    }

    public static String getSoftwareName(){
        return NAME;
    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getSku(){
        return sku;
    }

    public BigDecimal getPurchasePrice(){
        return purchasePrice;
    }

    public BigDecimal getSellingPrice(){
        return sellingPrice;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSku(String sku){
        this.sku = sku;
    }

    public void setPurchasePrice(BigDecimal purchasePrice){
        this.purchasePrice = purchasePrice;
    }

    public void setSellingPrice(BigDecimal sellingPrice){
        this.sellingPrice = sellingPrice;
    }

    public void addStock(int amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Invalid value!");
        }
            quantity += amount;
    }

    public void removeStock(int amount){
       if(amount <= 0){
           throw new IllegalArgumentException("Amount must be greater than zero.");
       } else if(amount > quantity){
           throw new IllegalArgumentException("Insufficient stock balance.");
       } else {
           quantity -= amount;
       }
    }

    public String getProductInfo(){
        return "Product Information" + "\n"
                + "_________________" + "\n"
                +"Product: " + name + "\n"
                + "ID: " + id + "\n"
                + "SKU: " + sku + "\n"
                + "Purchase price: " + purchasePrice + "\n"
                + "Selling price: " + sellingPrice + "\n"
                + "Quantity: " + quantity;
    }
}
