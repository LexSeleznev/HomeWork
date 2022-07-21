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

        int count = 0;
        for (int a = 0; a <= present; a = a + orange) {
            while (a + orange == 0) {
                System.out.println("Апельсин не может быть невесомым, выберите вес апельсина");
                orange = sc.nextInt();
            }
            for (int b = 0; b <= present; b = b + apple) {
                while (b + apple == 0) {
                    System.out.println("Яблоко не может быть невесомым, выберите вес яблока");
                    apple = sc.nextInt();
                }
                for (int c = 0; c <= present; c = c + pear) {
                    if (c + pear == 0) {
                        System.out.println("Груша не может быть невесомой, выберите вес груши");
                        pear = sc.nextInt();
                    }
                    if (a + b + c == present) {
                        count++;
                    }
                }
            }
        }
        System.out.println("Возможных вариантов " + count);
    }
}

