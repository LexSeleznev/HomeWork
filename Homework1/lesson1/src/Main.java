import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            double num1 = getNum();
            double num2 = getNum();
            String action = getAction();
            double result;
            if (action.equals("stop")) {
                System.out.println("Остановка");
                break;
            } else {
                result = score(num1, num2, action);
            }
            if (action.equals("/") && num2 == 0) {
                System.out.println("Пирожочек, на ноль делить нельзя, давай по новой");
            }
            else if (action.equals("-") || action.equals("+") || action.equals("/") || action.equals("*")) {
                System.out.println(num1 + " " + action + " " + num2 + " = " + result);
            }
            else {
                System.out.println("Введено неверное действие");
            }
        }
    }
    public static double getNum() {
        System.out.println("Введите число");
        double num;
        if (sc.hasNextDouble()) {
            num = sc.nextDouble();
        } else {
            System.out.println("Вы ввели не число, попробуйте еще раз");
            num = getNum();
        }
        return num;
    }
    public static String getAction() {
        String action;
        System.out.println("Выберите действие + - * / или введите stop для остановки");
        if (sc.hasNext()) {
            action = sc.next();
        }
        else {
            System.out.println("Вы ввели какую то дичь, выберите операцию из предложенных");
            action = getAction();
        }
        return action;
    }

    public static double score(double num1, double num2, String action) {
        double result = 0;
        switch (action) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            default:
                break;
        }
        return result;
    }
}