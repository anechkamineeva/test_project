//3. Найти сумму n-го количества элементов ряда 1, -0.5, 0.25, -0.125, …
import java.util.Scanner;

public class Mineeva_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        double a = 1;
        for (int i = 1; 1<=i&&i<=n; i +=1 )
        {
            sum = sum+a;
            a=-a/2;
        }
        System.out.println("Сумма " + n + " элементов ряда 1, -0.5, 0.25, -0.125, … равна: " + sum);

    }
}
