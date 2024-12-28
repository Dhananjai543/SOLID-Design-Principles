package solid.SingleResponsibilityPrinciple;

public class MyUtils {

    public static String serialize(Object object) {

        // serialize object to string in a way to store in db
        return object.toString();
    }

}
