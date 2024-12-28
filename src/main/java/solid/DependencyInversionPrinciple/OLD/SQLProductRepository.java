package solid.DependencyInversionPrinciple.OLD;

import java.util.List;

public class SQLProductRepository {

    public List<String> getAllProductNames() {
        return List.of("Product1", "Product2", "Product3");
    }

}
