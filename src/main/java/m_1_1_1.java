import java.util.Scanner;

public class m_1_1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a;
        float b;
        System.out.println("Введите число a");
        //считывание строки
        a = input.nextFloat();
        System.out.println("Введите число b");
        b = input.nextFloat();
        //int a,b;
        float c, d;
        int f;
        f = 20;
        c = Math.abs(a - f);
        //Метод Math.abs() возвращает абсолютное значение числа, то есть его модуль
        d = Math.abs(b - f);
        if (c < d) {
            System.out.println("Число " + a + " ближе к числу 20, чем число " + b);
        } else if (c > d) {
            System.out.println("Число " + b + " ближе к числу 20, чем число " + a);
        } else {
            System.out.println(" Оба числа " + a + " и " + b + " находятся на равном расстоянии от числа 20");
        }
    }
}
