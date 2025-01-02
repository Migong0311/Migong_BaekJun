import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        // System.out.println("A입력");
        // System.out.println("B입력");
        a = sc.nextInt();
        b = sc.nextInt();
        // if (a < 0 || a > 10 || b < 0 || b > 10) {
        // throw new NumberFormatException();
        // }

        System.out.println(a + b);
    }
}
