package solid.DependencyInversionPrinciple.OLD;

//Bad design
public class ProductCatalogClass {

    public void listAllProducts() {
        System.out.println("List of all products");
        SQLProductRepository sqlProductRepository = new SQLProductRepository();
        sqlProductRepository.getAllProductNames().forEach(System.out::println);
    }

}
