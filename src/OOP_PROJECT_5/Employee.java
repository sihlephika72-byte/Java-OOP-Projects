package OOP_PROJECT_5;

public abstract class Employee {
    private String empID;
    protected double baseSalary;
    private static int totalEmployees = 0;

    Employee(){
        this.empID = "EMP - 000";
        this.baseSalary = 0.0;
        totalEmployees++;
    }

    Employee(String empID, double baseSalary){
        this.empID = empID;
        this.baseSalary = baseSalary;
        totalEmployees++;
    }

    public String getEmpID(){
        return empID;
    }

    public String getBaseSalary(){
        return empID;
    }
    public static int getTotalEmployees(){
        return totalEmployees;
    }

    public abstract double calculatePay();

    @Override

    public String toString(){
        return "[ID: "+ empID + " | Base Salary: R" +baseSalary;
    }
}
