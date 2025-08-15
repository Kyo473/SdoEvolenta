import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создание нового списка ArrayList<User>
        ArrayList<User> users = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Введите имя пользователя " + i);
            String name = scanner.nextLine();

            System.out.println("Введите возраст пользователя " + i);
            Integer age = scanner.nextInt();
            scanner.nextLine();

            // Создание объекта User и добавление в список
            User user = new User(name, age);
            users.add(user);
        }

        // Сортировка списка по возрастанию возраста с использованием Comparator
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.getAge().compareTo(u2.getAge());
            }
        });


        for (User user : users) {
            System.out.println(user.toString());
        }

        scanner.close();
    }
}