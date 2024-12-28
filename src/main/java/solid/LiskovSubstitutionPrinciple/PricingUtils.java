package solid.LiskovSubstitutionPrinciple;

import java.util.List;

//Bad design
public class PricingUtils {

    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new InHouseProduct();

        List<Product> products = List.of(p1, p2, p3);

        products.forEach(product -> {
            if(product instanceof InHouseProduct) {
                ((InHouseProduct) product).applyExtraDiscount();
            }
            System.out.println("Product discount: " + product.getDiscount());
        });


    }
}
