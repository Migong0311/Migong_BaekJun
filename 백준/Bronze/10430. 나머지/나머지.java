import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        int result1 = (a + b) % c;
        int result2 = ((a % c) + (b % c)) % c;
        int result3 = (a * b) % c;
        int result4 = ((a % c) * (b % c)) % c;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}