import java.util.Scanner;

public class m_3_3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        float a;
        System.out.println("Введите число a");
        //считывание строки
        a = input.nextFloat();
        if (a >= 5 && a <= 155) {
            //&&
            if (a >= 25 && a <= 100) {
                System.out.println("Число " + a + " содержится в интервале (25,100)");
            } else {
                System.out.println("Число " + a + " не содержится в интервале (25,100)");
            }
        } else {
            System.out.println("Число " + a + " не содержится в интервале (5,155)");
        }
    }
}