
import java.util.ArrayList;

public class Main {
    private ArrayList<Employee> employees;

    public Main() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displaySalaries() {
        for (Employee employee : employees) {
            System.out.println("Employee: " + employee.getName() +
                    ", Position: " + employee.getPosition() +
                    ", Zp: " + employee.calculate());
        }
    }

    public static void main(String[] args) {
        Main system = new Main();

        Worker worker1 = new Worker("Жумышшы Бакдаулет", 1, "Worker", 1500, 160);
        Manager manager1 = new Manager("Менеджер Ернур", 2, "Manager", 300000, 50000);

        // Қызметкерлерді жүйеге қосу
        system.addEmployee(worker1);
        system.addEmployee(manager1);

        // Жалақыларын көрсету
        system.displaySalaries();
    }
}