import java.util.Scanner;

public class InputConsol {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String day, month;
        System.out.println("Какой сегодня день?");
        //считывание строки
        day = input.nextLine();

        System.out.println("Какой сегодня месяц?");
        month = input.nextLine();

        String text;

        text= "Сегодня - " + day + "месяц - " + month;

        System.out.println(text);
    }
}
