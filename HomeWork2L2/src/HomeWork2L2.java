import java.security.Policy;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class HomeWork2L2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.println("Введите слово");
        String word = sc.next();
        System.out.println("Введено слово " + word);
        System.out.println(palindromCheck(word));
//        String normalword = word.replaceAll("\\w","");

    }
    public static boolean palindromCheck (String word) {
        String a1 = word;
        a1 = a1.toUpperCase().replaceAll("[\\s|\\u00A0]+","");
        StringBuffer a2 = new StringBuffer(a1).reverse();
        String a3 = a2.toString();
        boolean result = false;
        System.out.println("a1 = " + a1);
        System.out.println("a3 = " + a3);
        if (a1.equals(a3)) {
            result = true;
        }
        return result;
    }
}
