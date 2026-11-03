public abstract class Student 
{
    protected String id;
    protected String name;
    protected int modulesCompleted;
    protected double accountBalance;

    public Student(String id, String name, int modulesCompleted, double accountBalance)
    {
        this.id = id;
        this.name = name;
        this.modulesCompleted = modulesCompleted;
        this.accountBalance = accountBalance;
    }
   
    public abstract int calculateCredits();
    public abstract double calculateNewBalance();
    public abstract String makeReport();
}