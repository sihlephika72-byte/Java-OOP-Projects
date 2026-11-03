package OOP_PROJECT_5;

public class Main {
    public static void main(String[] args){
        Employee[] employees = new Employee[3];
        employees[0] = new FullTimeEmployee("E101", 20000.0, 5000.0);
        employees[1] = new Contractor("C202", 250.0, 80);
        employees[2] = new FullTimeEmployee("E103", 18000.0, 3000.0);

        for(Employee employee : employees){
            System.out.println(employee);
            System.out.println("Gross amount: R" + employee.calculatePay());
        }
        System.out.println("Total employees: " + Employee.getTotalEmployees());
    }

}
