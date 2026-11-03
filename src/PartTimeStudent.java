public class PartTimeStudent extends Student {

    public PartTimeStudent(String id, String name, int modulesCompleted, double accountBalance) {
        super(id, name, modulesCompleted, accountBalance);
    }

    @Override
    public int calculateCredits() {
        return modulesCompleted * 15;
    }

    @Override
    public double calculateNewBalance() {
        int credits = calculateCredits();
        if (accountBalance < 5000 && credits < 100) {
            return accountBalance;
        } else if (accountBalance < 5000 && credits >= 100) {
            return accountBalance * 1.05;
        } else {
            return accountBalance * 1.10;
        }
    }

    @Override
    public String makeReport() {
        return String.format("Part-time student {\nid: %s\nname: %s\ncredits: %d\nbalance: R%.2f\n}",
                id, name, calculateCredits(), calculateNewBalance());
    }
}