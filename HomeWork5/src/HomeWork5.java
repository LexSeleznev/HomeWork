import java.util.Scanner;

public class HomeWork5 {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){
        stars();
        }
    public static void stars () {
        int n = sc.nextInt();
        for (; n > 0; n--) {
            if (n%50== 0) {
                System.out.println("");
            }
            System.out.print("*");
        }
    }
}
