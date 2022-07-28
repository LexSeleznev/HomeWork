import java.util.Scanner;

public class HomeWork3L2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int counter1 = 1;
        int counter2 = 0;
        for(int i = 0; i<num.length()-1; i++) {
            if (num.charAt(i) == num.charAt(i+1)) {
                counter1++;
            }
            else {
                counter2 = counter1;
                counter1 = 1;
            }
            if (counter1 > counter2) {
                counter2 = counter1;
            }
        }
        System.out.println("Максимаальная последовательность " + counter2);
    }
}
