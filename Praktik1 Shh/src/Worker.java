public class Worker extends Employee{
    private double hourlyRate;
    private int hoursWorked;

    public Worker(String name, int employeeId, String position, double hourlyRate, int hoursWorked) {
        super(name, employeeId, position);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculate() {
        return hourlyRate * hoursWorked;
    }
}
