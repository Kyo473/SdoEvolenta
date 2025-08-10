import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random rand = new Random();

        System.out.print("Массив: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(15) + 1; // числа от 1 до 15
            System.out.print(numbers[i] + " ");
        }
        System.out.println();


        System.out.println("Повторяющиеся числа:");
        boolean foundDuplicates = false;

        for (int i = 1; i <= 15; i++) {
            int count = 0;
            for (int num : numbers) {
                if (num == i) count++;
            }
            if (count > 1) {
                System.out.printf("Число '%d' встречается %d раза%n", i, count);
                foundDuplicates = true;
            }
        }

        if (!foundDuplicates) {
            System.out.println("Нет повторяющихся чисел");
        }
    }
}