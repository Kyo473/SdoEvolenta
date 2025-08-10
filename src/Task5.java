import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        try {
            System.out.println("Введите дату в формате dd.MM.yyyy:");
            Date date = dateFormat.parse(scanner.nextLine());

            // Дата после увеличения на 45 дней
            Date datePlus45 = new Date(date.getTime() + 45L * 24 * 60 * 60 * 1000);
            System.out.println("Дата после увеличения на 45 дней: " + dateFormat.format(datePlus45));

            // Дата после сдвига на начало года
            SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
            Date yearStart = dateFormat.parse("01.01." + yearFormat.format(date));
            System.out.println("Дата после сдвига на начало года: " + dateFormat.format(yearStart));

            // Дата после увеличения на 10 рабочих дней
            Date workDaysAdded = addWorkDays(date, 10);
            System.out.println("Дата после увеличения на 10 рабочих дней: " + dateFormat.format(workDaysAdded));

            // Ввод второй даты
            System.out.println("Введите вторую дату в формате dd.MM.yyyy:");
            Date secondDate = dateFormat.parse(scanner.nextLine());

            // Количество рабочих дней между введенными датами:
            int workDays = countWorkDays(date, secondDate);
            System.out.println("Количество рабочих дней между введенными датами: " + workDays);

        } catch (Exception e) {
            System.out.println("Ошибка ввода даты!");
        } finally {
            scanner.close();
        }
    }

    // Добавление рабочих дней (без учета выходных)
    private static Date addWorkDays(Date start, int days) {
        long time = start.getTime();
        int added = 0;
        while (added < days) {
            time += 24 * 60 * 60 * 1000; // +1 день
            Date temp = new Date(time);
            if (isWorkDay(temp)) added++;
        }
        return new Date(time);
    }

    // Подсчет рабочих дней между датами
    private static int countWorkDays(Date start, Date end) {
        long startTime = Math.min(start.getTime(), end.getTime());
        long endTime = Math.max(start.getTime(), end.getTime());
        int count = 0;

        for (long time = startTime; time < endTime; time += 24 * 60 * 60 * 1000) {
            if (isWorkDay(new Date(time))) count++;
        }
        return count;
    }

    // Проверка на рабочий день (пн-пт)
    private static boolean isWorkDay(Date date) {
        int day = date.getDay(); // 0-вс, 1-пн, ..., 6-сб
        return day > 0 && day < 6;
    }
}