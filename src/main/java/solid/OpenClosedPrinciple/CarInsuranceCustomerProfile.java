package solid.OpenClosedPrinciple;

import java.util.Random;

public class CarInsuranceCustomerProfile implements CustomerProfile {

    @Override
    public boolean isLoyal() {
        return new Random().nextBoolean();
    }
}
