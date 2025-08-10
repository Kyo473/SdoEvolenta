import java.util.Scanner;
import java.lang.Math;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Проверка на деление на 5
        boolean hasMultipleOf5 = false;
        if (a % 5 == 0) {
            System.out.println("a=" + a);
            hasMultipleOf5 = true;
        }
        if (b % 5 == 0) {
            System.out.println("b=" + b);
            hasMultipleOf5 = true;
        }
        if (c % 5 == 0) {
            System.out.println("c=" + c);
            hasMultipleOf5 = true;
        }
        if (!hasMultipleOf5) {
            System.out.println("нет значений, кратных 5");
        }

        // Целочисленное деление
        System.out.println("Результат целочисленного деления a на b: " + (a / b));

        // Деление с плавающей точкой
        System.out.println("Результат деления a на b: " + ((double)a / b));

        // Округление в большую сторону
        System.out.println("Результат деления a на b с округлением в большую сторону: " + Math.ceil((double)a / b));

        // Округление в меньшую сторону
        System.out.println("Результат деления a на b с округлением в меньшую сторону: " + Math.floor((double)a / b));

        // Математическое округление
        System.out.println("Результат деления a на b с математическим округлением: " + Math.round((double)a / b));

        // Остаток от деления
        System.out.println("Остаток от деления b на c: " + (b % c));

        // Наименьшее значение
        System.out.println("Наименьшее значение из a и b: " + Math.min(a, b));

        // Наибольшее значение
        System.out.println("Наибольшее значение из b и c: " + Math.max(b, c));

        scanner.close();
    }
}