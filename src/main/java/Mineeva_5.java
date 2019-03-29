//5. требуется определить факториал числа, которое ввел пользователь.
// (вводить факториал не больше 30 , чтобы машину не загрузить)
import java.util.Scanner;

public class Mineeva_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int n;
        long m = 1;
        n = input.nextInt();
        if (n >= 0 && n <= 15) {
            for (int i = n; i > 0; i--) {
                m *= i;
            }
            System.out.println("Факториал " + n + ": " + m);

        } else System.out.println("Число " + n + " - отрицательное или больше 15");
    }
}


