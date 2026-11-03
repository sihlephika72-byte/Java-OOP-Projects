package OOP_PROJECT_5;

public class FullTimeEmployee extends Employee{
    private double bonus;
    FullTimeEmployee(String empID, double baseSalary, double bonus){
        super(empID, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculatePay() {
        return baseSalary + bonus;
    }

    @Override
    public String toString(){
        return super.toString() + " | Bonus: R"+ bonus + "]";
    }
}
