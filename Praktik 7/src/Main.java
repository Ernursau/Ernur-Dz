import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner =new  Scanner(System.in);
        Oplata context = new Oplata();

        System.out.println("Выберите Способ оплаты");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice){
            case 1:
                context.setOplata(new Cart(44004100,"Ernur Saulen",321));
                break;
            case 2:
                context.setOplata(new Kaspi("87058163264","Ernur Saulen"));
                break;
            case 3:
                context.setOplata(new Binans("Bitcoins","Binans123",300));
                break;
            default:
                System.out.println("Неверный выбор ");
        }

    }

}