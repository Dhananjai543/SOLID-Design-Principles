package solid.InterfaceSegregationPrinciple.OLD;

public class XeroxWorkCentre implements IMultiFunction {

    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
    public void printPhoto() {
        System.out.println("Print Photo");
    }

    @Override
    public void scan() {
        System.out.println("Scan");
    }

    @Override
    public void scanPhoto() {
        System.out.println("Scan Photo");
    }

    @Override
    public void fax() {
        System.out.println("Fax");
    }

    @Override
    public void internetFax() {
        System.out.println("Internet fax");
    }
}
