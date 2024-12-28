package solid.OpenClosedPrinciple;

public class InsurancePremiumDiscountCalculatorClass {

//    Refactor #1

//    public int calculatePremium(HealthInsuranceCustomerProfile customerProfile) {
//        if(customerProfile.isLoyal()){
//            return 20;
//        }
//        return 0;
//    }

    public int calculatePremium(CustomerProfile customerProfile) {
        if(customerProfile.isLoyal()){
            return 20;
        }
        return 0;
    }

}
