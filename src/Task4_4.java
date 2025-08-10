import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Task4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату в формате 'дд.мм.гггг'");
        String inputDate = scanner.nextLine();

        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("dd.MM.yyyy");
            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");

            Date date = inputFormat.parse(inputDate);
            String newDate = outputFormat.format(date);

            System.out.println(newDate);
        } catch (ParseException e) {
            System.out.println("Неверный формат даты!");
        }

        scanner.close();
    }
}