package solid.LiskovSubstitutionPrinciple;

public class InHouseProduct extends Product{

//    Refactor #1 (override method)
    @Override
    public double getDiscount() {
        this.applyExtraDiscount();
        return discount;
    }

    public void applyExtraDiscount() {
        // Applying extra discount on in-house products
        discount = discount * 1.5;
    }

}
