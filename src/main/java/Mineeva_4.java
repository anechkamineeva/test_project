//Найти сумму и количество элементов последовательности, которые по модулю больше 0.001.
// Последовательность: S = 1/2 - 2/4 + 3/8 - 4/16 + ... - ...
public class Mineeva_4 {
   public static void main(String[] args) {
        int n; //счетчик количества элементов ряда
        float a; //числитель дроби числа
        float b; //знаменатель дроби числа
        int mark; //знак числа
        double sum;
        a = 1;
        b = 2;
        mark = 1;
        sum = 0;
        n = 0;
        while (a/b > 0.001) {
            sum = sum + mark*a/b;
            a = a + 1;
            b = b * 2;
            mark = -mark;
            n = n + 1;
        }
        System.out.println("Сумма S = " + sum);
        System.out.println("Количество элементов: " + n);
    }
}
