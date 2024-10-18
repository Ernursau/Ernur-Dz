
import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<User> users;

    public Main() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void updateUser(User user, String newName, String newEmail, String newRole) {
        user.setName(newName);
        user.setEmail(newEmail);
        user.setRole(newRole);
    }

    public void displayUsers() {
        for (User user : users) {
            System.out.println("Name: " + user.getName() + ", Email: " + user.getEmail() + ", Role: " + user.getRole());
        }
    }

    public static void main(String[] args) {
        Main userManager = new Main();

        User user1 = new User("Ернур", "ernursaulen@gmail.com@mail.kz", "Admin");
        User user2 = new User("Еркебұлан", "erkebulan@mail.kz", "User");

        userManager.addUser(user1);
        userManager.addUser(user2);

        userManager.displayUsers();

        userManager.updateUser(user1, "Алихан Рахат", "alihan_rk@mail.kz", "Super Admin");
        userManager.displayUsers();

        userManager.removeUser(user2);
        userManager.displayUsers();
    }
}