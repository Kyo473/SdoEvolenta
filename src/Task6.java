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
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос данных первого пользователя
        System.out.println("Введите имя первого пользователя");
        String firstName = scanner.nextLine();

        System.out.println("Введите возраст первого пользователя");
        Integer firstAge = scanner.nextInt();
        scanner.nextLine(); // очистка буфера после nextInt()

        // Создание первого объекта User
        User user1 = new User(firstName, firstAge);

        // Запрос данных второго пользователя
        System.out.println("Введите имя второго пользователя");
        String secondName = scanner.nextLine();

        System.out.println("Введите возраст второго пользователя");
        Integer secondAge = scanner.nextInt();

        // Создание второго объекта User
        User user2 = new User(secondName, secondAge);

        // Определение пользователя с наименьшим возрастом и вывод
        if (user1.getAge() <= user2.getAge()) {
            System.out.println(user1.toString());
        } else {
            System.out.println(user2.toString());
        }

        scanner.close();
    }
}