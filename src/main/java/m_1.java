public class m_1 {
    public static void main(String[] args) {
        double a,b,c,d,e;
        a = 10;
        b = 1;
        e = 20;
        c = Math.abs(a-e);
        //Метод Math.abs() возвращает абсолютное значение числа, то есть его модуль
        d = Math.abs(b-e);
        if(c<d) {
            System.out.println("Число "+a+" ближайшее к 20");
        } else if(c>d) {
            System.out.println("Число "+b+" ближайшее к 20");
        } else {
            System.out.println(" Оба числа находятся на равном расстоянии от числа 20");
        }
    }
}
