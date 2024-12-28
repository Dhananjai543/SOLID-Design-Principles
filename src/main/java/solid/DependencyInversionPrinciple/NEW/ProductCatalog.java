package solid.DependencyInversionPrinciple.NEW;

public class ProductCatalog {

    public void listAllProducts() {
        ProductRepository productRepository = ProductFactory.createProductRepository();
        for (String productName : productRepository.getAllProductNames()) {
            System.out.println(productName);
        }
    }

}
