package solid.SingleResponsibilityPrinciple;

//Reasons To Change
//Changes in employee attributes
//Changes in database
//Changes in tax calculation

public class Employee {

    private String employeeId;
    private String employeeName;
    private String employeeAddress;
    private String employeePhone;
    private String employeeType;

    public Employee(String employeeId, String employeeName, String employeeAddress, String employeePhone, String employeeType) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.employeeType = employeeType;
    }

//    Refractor #1

//    public void save() {
//        String objectStr = MyUtils.serialize(this);
//        Connection connection = null;
//        Statement statement = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "root");
//            statement = connection.createStatement();
//            statement.execute("INSERT INTO employees VALUES (" + objectStr + ")");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public void save() {
        new EmployeeRepository().save(this);
    }

//    Refractor #2

//    public void calculateTax() {
//        if(this.getEmployeeType().equals("fulltime")) {
//            // calculate tax for full time employee
//        } else if(this.getEmployeeType().equals("parttime")) {
//            // calculate tax for part time employee
//        }
//
//    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }
}