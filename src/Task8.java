import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создание новой мапы HashMap<Integer, List<User>>
        HashMap<Integer, List<User>> userMap = new HashMap<>();

        // Циклический запрос данных 5-ти пользователей
        for (int i = 1; i <= 5; i++) {
            System.out.println("Введите имя пользователя " + i);
            String name = scanner.nextLine();

            System.out.println("Введите возраст пользователя " + i);
            Integer age = scanner.nextInt();
            scanner.nextLine(); // очистка буфера после nextInt()

            // Создание объекта User
            User user = new User(name, age);

            // Проверка существования ключа в мапе
            if (userMap.containsKey(age)) {
                // Если ключ существует, добавляем пользователя в существующий список
                userMap.get(age).add(user);
            } else {
                // Если ключ не существует, создаем новый список и добавляем пользователя
                List<User> userList = new ArrayList<>();
                userList.add(user);
                userMap.put(age, userList);
            }
        }

        // Запрос требуемого возраста
        System.out.println("Введите требуемый возраст");
        Integer requiredAge = scanner.nextInt();

        // Проверка наличия пользователей с требуемым возрастом
        if (userMap.containsKey(requiredAge)) {
            List<User> usersWithAge = userMap.get(requiredAge);

            // Сортировка списка по имени
            Collections.sort(usersWithAge, new Comparator<User>() {
                @Override
                public int compare(User u1, User u2) {
                    return u1.getName().compareTo(u2.getName());
                }
            });

            // Вывод отсортированного списка пользователей
            for (User user : usersWithAge) {
                System.out.println(user.toString());
            }
        } else {
            System.out.println("Пользователь с возрастом '" + requiredAge + "' не найден");
        }

        scanner.close();
    }
}