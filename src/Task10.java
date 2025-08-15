import java.util.stream.LongStream;

public class Task10 {

    /**
     * Вычисляет сумму чисел между a (включительно) и b (исключительно)
     * используя Stream API
     *
     * @param a начальное число (включается)
     * @param b конечное число (исключается)
     * @return сумма чисел в диапазоне [a, b)
     */
    public static long getArithmeticProgressionSum(int a, int b) {
        // Используем LongStream.range для генерации чисел от a до b (исключая b)
        return LongStream.range(a, b)
                .sum(); // суммируем все элементы
    }

    public static void main(String[] args) {
        // Тестирование на примере из задания
        System.out.println("Пример: a = 3, b = 6");
        long example = getArithmeticProgressionSum(3, 6);
        System.out.println("Результат: " + example);
        System.out.println("Проверка: 3 + 4 + 5 = " + (3 + 4 + 5));
        System.out.println();

        // Вычисление для больших чисел
        System.out.println("Вычисление для a = 10_000_000, b = 1_000_000_000");
        long startTime = System.currentTimeMillis();

        long result = getArithmeticProgressionSum(10_000_000, 1_000_000_000);

        long endTime = System.currentTimeMillis();

        System.out.println("Результат: " + result);
        System.out.println("Время выполнения: " + (endTime - startTime) + " мс");

    }
}