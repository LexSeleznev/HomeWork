public class Main {
    public static void main (String[] args) {
        int start = 1000;
        int end = 0;
        int step = 2;
        for (int i = start; i>end; i = i - step) {
            System.out.println(i);
        }
    }
}
