import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Как тебя зовут?");
        Scanner name = new Scanner(System.in);
        System.out.println("Привет," + name.nextLine()+"!");
    }
}