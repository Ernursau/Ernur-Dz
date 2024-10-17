public class Manager extends Employee {
    private double fixedZp;
    private double bonus;

    public Manager(String name, int employeeId, String position, double fixedZp, double bonus) {
        super(name, employeeId, position);
        this.fixedZp = fixedZp;
        this.bonus = bonus;
    }

    @Override
    public double calculate() {
        return fixedZp + bonus;
    }
}
