import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату в формате 'дд.мм.гггг'");
        String date = scanner.nextLine();

        String[] parts = date.split("\\.");
        String newDate = parts[2] + "-" + parts[1] + "-" + parts[0];

        System.out.println(newDate);
        scanner.close();
    }
}