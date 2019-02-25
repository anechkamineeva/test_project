import java.util.Scanner;

public class InputConsolMineeva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String dayw, nastr;
        System.out.println("Какой сегодня день недели?");
        //считывание строки
        dayw = input.nextLine();

        System.out.println("Как настроение?");
        nastr = input.nextLine();

        String text;

        text= "Сегодня день недели - " + dayw + "  поннастроение - " + nastr;

        System.out.println(text);
    }
}
