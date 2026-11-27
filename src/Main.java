import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        System.out.println(Product.getSoftwareName());
        try {
            Product macbookpro = new Laptop(1, "MacBook Pro", "MAC-001", new BigDecimal("1200.00"), new BigDecimal("1600.00"),15,"Apple", 16);
            Product iphone = new Phone(2, "Iphone", "IPH-002", new BigDecimal("500.00"), new BigDecimal("750.00"), 20, "Apple", 18);
            iphone.printRecipe();
            System.out.println(Product.getNumProducts());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
