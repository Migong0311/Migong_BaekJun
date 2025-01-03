import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 한 줄로 입력받기
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        // A, B, C 추출 및 합산
        long A = Long.parseLong(numbers[0]);
        long B = Long.parseLong(numbers[1]);
        long C = Long.parseLong(numbers[2]);

        // 결과 출력
        System.out.println(A + B + C);

        scanner.close();
    }
}