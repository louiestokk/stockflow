import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        System.out.println(Product.getSoftwareName());
        try {
            Product macbookpro = new Product(1, "MacBook Pro", "MAC-001", new BigDecimal("1200.00"), new BigDecimal("1600.00"),15);
            System.out.println(macbookpro.getProductInfo());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
