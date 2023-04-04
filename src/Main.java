import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zero result = new Zero();
        System.out.println("Введите первое число");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int num2 = scanner.nextInt();
        int sum = num1+num2;
        int sum2 = num1*num2;
        int sum3 = sum*sum2;
        System.out.println(sum3);

    }
}