import java.util.Scanner;

public class HomeWork4 {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) {
        int present = 0;
        int orange = 0;
        int apple = 0;
        int pear = 0;
        System.out.println("Введите вес подарка");
        present = getWeight();
        System.out.println("Введите вес апельсинов");
        orange = getWeight();
        System.out.println("Введите вес яблок");
        apple = getWeight();
        System.out.println("Введите вес груш");
        pear = getWeight();
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
    public static int getWeight(int zero) {
        zero = sc.nextInt();
        while (zero == 0) {
            System.out.println("Вы ввели ноль, укажите правильный вес");
            zero = sc.nextInt();

        }
        return zero;
    }
}

