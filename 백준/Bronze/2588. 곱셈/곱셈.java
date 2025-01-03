import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        int step1 = a * (b % 10);
        int step2 = a * ((b / 10) % 10);
        int step3 = a * (b / 100);
        int result = a * b;

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(result);
    }
}