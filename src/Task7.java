import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class User {
    private String name;
    private Integer age;

    // Конструктор класса
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    // Сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    // Метод toString()
    @Override
    public String toString() {
        return name + ", возраст " + age + " лет";
    }
}

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