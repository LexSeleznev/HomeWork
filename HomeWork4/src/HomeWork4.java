import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeWork4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int present = 0;
        int orange = 0;
        int apple = 0;
        int pear = 0;
        System.out.println("Введите вес подарка");
        present = sc.nextInt();
        System.out.println("Введите вес апельсинов");
        orange = sc.nextInt();
        System.out.println("Введите вес яблок");
        apple = sc.nextInt();
        System.out.println("Введите вес груш");
        pear = sc.nextInt();
        while (orange == 0) {
            System.out.println("Апельсин не может быть невесомым, выберите вес апельсина");
            orange = sc.nextInt();
        }
        while (apple == 0) {
            System.out.println("Яблоко не может быть невесомым, выберите вес яблока");
            apple = sc.nextInt();
        }
        while (pear == 0) {
            System.out.println("Груша не может быть невесомой, выберите вес груши");
            pear = sc.nextInt();
        }
        while (present == 0) {
            System.out.println("Подарок не может быть невесомым, выберите вес подарка");
            present = sc.nextInt();
        }
        int count = 0;
        for (int a = 0; a <= present; a = a + orange) {
            for (int b = 0; b <= present; b = b + apple) {
                for (int c = 0; c <= present; c = c + pear) {
                    if (a + b + c == present) {
                        count++;
                    }
                }
            }
        }
        System.out.println("Возможных вариантов " + count);
    }
}

