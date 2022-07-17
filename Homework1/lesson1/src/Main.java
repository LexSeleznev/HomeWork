import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        String action;
        double result = 0;
        while (true) {
            System.out.println("Выберите действие + - * / или введите stop для остановки");
            action = sc.next();
            if (action.equals("stop")) {
                System.out.println("Остановка");
                break;
            }
            System.out.println("Введите первое число");
            num1 = sc.nextDouble();
            System.out.println("Введите второе число");
            num2 = sc.nextDouble();
            switch (action) {
                case "+":
                    result = num1 + num2;
                    System.out.println(num1 + " " + action + " " + num2 + " равно " + result);
                    result = 0;
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.println(num1 + " " + action + " " + num2 + " равно " + result);
                    result = 0;
                    break;
                case "/":
                    while (num2 == 0){
                        System.out.println("Пирожочек, на ноль делить нельзя, выбери другое число");
                        num2 = sc.nextDouble();
                    }
                    result = num1 / num2;
                    System.out.println(num1 + " " + action + " " + num2 + " равно " + result);
                    result = 0;
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.println(num1 + " " + action + " " + num2 + " равно " + result);
                    result = 0;
                    break;
                default:
                    System.out.println("Введено неверное действие");
                    break;
            }
        }
    }
}
