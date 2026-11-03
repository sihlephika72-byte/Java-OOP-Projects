package OOP_PROJECT_5;

public class Contractor extends Employee{
    private double hourlyRate;
    private int hoursWorked;

    Contractor(String empID, double hourlyRate, int hoursWorked) {
        super(empID, 0.0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculatePay(){
        return hourlyRate*hoursWorked;
    }
    @Override
    public String toString(){
        return super.toString() + " | Hourly Rate: R"+ hourlyRate + " | Hours Worked: "+ hoursWorked + "]";
    }
}
