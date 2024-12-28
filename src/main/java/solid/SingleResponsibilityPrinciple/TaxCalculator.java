package solid.SingleResponsibilityPrinciple;

public class TaxCalculator {

    public void calculateTax(Employee employee) {
        if(employee.getEmployeeType().equals("fulltime")) {
            // calculate tax for full time employee
        } else if(employee.getEmployeeType().equals("parttime")) {
            // calculate tax for part time employee
        }

    }
}
