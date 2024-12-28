package solid.DependencyInversionPrinciple.NEW;

public class ProductFactory {

    public static ProductRepository createProductRepository() {
        return new SQLProductRepository();
    }
}
