import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeWork2L2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово");
        String word = sc.next();
        System.out.println("Введено слово " + word);
        String normalword = word.replaceAll("\\W","");
        System.out.println("Слово без знаков " + normalword);
        StringBuilder sbilder = new StringBuilder(normalword);
        sbilder.reverse();
        String reeverseword = sbilder.toString();
        System.out.println("Слово без знаков " + normalword);
        System.out.println("reverseword is " +reeverseword);
        if (word.equalsIgnoreCase(reeverseword)) {
            System.out.println("Это полиндром");
        }
        else {
            System.out.println("Это не полиндром");
        }
    }
}
