import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeliveryContext context = new DeliveryContext();

        System.out.println("Выберите метод доставки: ");
        System.out.println("1: Стандартная доставка");
        System.out.println("2: Экспресс-доставка");
        System.out.println("3: Международная доставка");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        System.out.print("Введите вес посылки (кг): ");
        double weight = scanner.nextDouble();

        System.out.print("Введите расстояние доставки (км): ");
        double distance = scanner.nextDouble();

        boolean isNight = false;
        if (choice == 1 || choice == 2) {
            System.out.println("Добавить ночную доставку? (да/нет): ");
            String nightChoice = scanner.next();
            isNight = nightChoice.equalsIgnoreCase("да");
        }

        switch (choice) {
            case 1:
                context.setShippingStrategy(new StandartDostavka());
                break;
            case 2:
                context.setShippingStrategy(new ExpressDostavka());
                break;
            case 3:
                context.setShippingStrategy(new InternationalDostavka());
                break;
            default:
                System.out.println("Неверный выбор. Попробуйте снова.");
                return;
        }

        double cost = context.Colculate(weight, distance, isNight);
        System.out.println("Стоимость доставки: " + cost);
    }
}
