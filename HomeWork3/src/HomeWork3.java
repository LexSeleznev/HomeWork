import java.util.Scanner;

public class HomeWork3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
//= num/100000+num%100000/10000+num%10000/1000;
//= num%1000/100+num%100/10+num%10;
        System.out.println("Введите номер билета");
        num = sc.nextInt();
        int count1 = 1;
        int count2 = 1;
        int sum1 = 0;
        int sum2 = 0;
        int length = String.valueOf(num).length();
//        System.out.println("Длинна числа равна " + length);
        if (length%2 == 0) {
            for (int i = length; i>0; i--){
                count1 = count1*10;
            }
            count2 = count1/10;
//        System.out.println(num%1000000/100000);
            for (int a = length/2; a>0; a--) {
                sum1 = sum1 + num%count1/count2;
                count1 = count1/10;
                count2 = count2/10;
//          System.out.println("Сумма равна " + sum1);
            }
            for (int a = length; a>length/2; a--) {
                sum2 = sum2 + num%count1/count2;
                count1 = count1/10;
                count2 = count2/10;
//            System.out.println("Сумма равна " + sum2);
            }

            System.out.println("Сумма первой половины числа " + sum1 + " сумма второй половины " +sum2);
            if (sum1 == sum2) {
                System.out.println("Поздравляем, ваш билет - счастливый! Загадайте желание и сьеште его, приятного аппетита =)");
            }
            else {
                System.out.println("Увы, у вас обычный билет");
            }
        }
        else {
            System.out.println("Нечетные числа не бывают счастливыми =)");
        }

    }
}
