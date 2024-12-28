package solid.InterfaceSegregationPrinciple.OLD;

public class CanonPrinter implements IMultiFunction{
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

    }

    @Override
    public void scanPhoto() {

    }

    @Override
    public void fax() {

    }

    @Override
    public void internetFax() {

    }
}
