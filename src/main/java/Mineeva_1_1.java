//Написать программу, подсчитывающую количество четных и нечетных цифр в числе.
import java.util.Scanner;

public class Mineeva_1_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scanner.nextInt();
        int ost;
        int chet=0;
        int nechet=0;
        while (a > 0) {
            ost= a % 10;
            a = a / 10;
            if (ost% 2 == 0) {
                chet = chet + 1;
            } else if (ost % 2 != 0)

                nechet = nechet + 1;
        }
        System.out.println("Четных цифр: " + chet);
        System.out.println("Нечетных цифр: " + nechet);
    }
}
