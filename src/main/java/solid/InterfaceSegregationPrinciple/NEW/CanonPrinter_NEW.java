package solid.InterfaceSegregationPrinciple.NEW;

public class CanonPrinter_NEW implements IPrint_NEW {
    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
    public void printPhoto() {
        System.out.println("Print Photo");
    }

}
