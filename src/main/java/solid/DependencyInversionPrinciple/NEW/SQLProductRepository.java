package solid.DependencyInversionPrinciple.NEW;

import java.util.List;

public class SQLProductRepository implements ProductRepository{
    @Override
    public List<String> getAllProductNames() {
        return List.of("Product1", "Product2", "Product3");
    }
}
