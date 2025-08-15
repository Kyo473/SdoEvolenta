
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.IntStream;

// Интерфейс Learner
interface Learner {
    void learn();
}

// Базовый класс Student
class Student implements Learner {
    @Override
    public void learn() {
        System.out.println("Я учусь. .zZ");
        IntStream.range(0, 1000000).forEach(i -> Math.log(i));
        System.out.println("Я закончил учиться");
    }
}

// Декоратор StudentWithClock
class StudentWithClock implements Learner {
    private Learner learner;

    public StudentWithClock(Learner learner) {
        this.learner = learner;
    }

    @Override
    public void learn() {
        learner.learn();

        // Получаем текущее время и форматируем его в чч:мм:сс
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);

        System.out.println("Текущее время: " + formattedTime);
    }
}

// Главный класс для демонстрации
public class Task9 {
    public static void main(String[] args) {
        // Использование шаблона декоратор
        new StudentWithClock(new Student()).learn();
    }
}