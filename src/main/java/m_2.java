import java.util.Scanner;

public class m_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Введите число a");
        //считывание строки
        a = input.nextInt();
        if (a % 2 == 0) {
            System.out.println("Число " + a + " четное!");
        } else if (a % 2 != 0) {
            System.out.println("Число " + a + " нечетное!");

        }
    }
}
