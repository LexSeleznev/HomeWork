import java.util.Scanner;

public class HomeWork3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Введите номер билета");
        num = sc.nextInt();
        int num1 = num/100000;
        int num2 = num%100000/10000;
        int num3 = num%10000/1000;
        int num4 = num%1000/100;
        int num5 = num%100/10;
        int num6 = num%10;
        int sum1 = num1+num2+num3;
        int sum2 = num4+num5+num6;
//        System.out.println(sum1 + " " +sum2);//
//        System.out.println(num1 + " "+num2 + " "+num3 + " "+num4 + " "+num5 + " "+num6);
        if (sum1 == sum2) {
            System.out.println("Поздравляем, ваш билет - счастливый! Загадайте желание и сьеште его, приятного аппетита =)");
        }
        else {
            System.out.println("Увы, у вас обычный билет");
        }

    }
}
