import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        String text = scanner.nextLine();

        System.out.println("Введите подстроку");
        String substring = scanner.nextLine();

        int count = 0;
        int index = 0;
        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }

        System.out.printf("Подстрока '%s' встречается %d раза%n", substring, count);
        scanner.close();
    }
}