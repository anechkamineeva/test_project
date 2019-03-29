//Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.
import java.util.Scanner;

public class Mineeva_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int a = scanner.nextInt();
        int chet;
        int ost;
        chet = 0;
        while (a > 0) {
            ost=a%10;
            a=a/10;
            if (ost % 2 == 0) {
                chet = chet + ost;
            }
        }
        System.out.println("Сумма четных цифр: " + chet);



    }
}
