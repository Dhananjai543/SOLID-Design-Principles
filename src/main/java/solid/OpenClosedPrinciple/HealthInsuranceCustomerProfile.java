package solid.OpenClosedPrinciple;

import java.util.Random;

// Refractor #1

//public class HealthInsuranceCustomerProfile {
//    public boolean isLoyal() {
//        return new Random().nextBoolean();
//    }
//}

public class HealthInsuranceCustomerProfile implements CustomerProfile {

    @Override
    public boolean isLoyal() {
        return new Random().nextBoolean();
    }
}

