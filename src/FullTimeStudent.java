public class FullTimeStudent extends Student {

    public FullTimeStudent(String id, String name, int modulesCompleted, double accountBalance) {
        super(id, name, modulesCompleted, accountBalance);
    }

    @Override
    public int calculateCredits() {
        return modulesCompleted * 30;
    }

    @Override
    public double calculateNewBalance() {
        int credits = calculateCredits();
        if (accountBalance < 3000 && credits < 50) {
            return accountBalance;
        } else if (accountBalance < 3000 && credits >= 50) {
            return accountBalance * 1.08;
        } else {
            return accountBalance * 1.16;
        }
    }

    @Override
    public String makeReport() {
        return String.format("Full-time student {\nid: %s\nname: %s\ncredits: %d\nbalance: R%.2f\n}",
                id, name, calculateCredits(), calculateNewBalance());
    }
}