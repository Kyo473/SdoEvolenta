import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        String text = scanner.nextLine();

        String result = text.replace("бяка", "вырезано цензурой")
                .replace("кака", "вырезано цензурой");

        System.out.println(result);
        scanner.close();
    }
}