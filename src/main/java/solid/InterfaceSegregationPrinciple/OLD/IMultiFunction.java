package solid.InterfaceSegregationPrinciple.OLD;

//Bad design
public interface IMultiFunction {

    public void print();

    public void printPhoto();

    public void scan();

    public void scanPhoto();

    public void fax();

    public void internetFax();

}
