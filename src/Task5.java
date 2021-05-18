import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 100 ");
        int a = sc.nextInt();
        if (a > 1 && a < 100) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (a % 3 != 0 && a % 5 != 0) {
                System.out.println(a);
            } else if (a % 3 == 0) {
                System.out.println("Fizz");
            } else if (a % 5 == 0) {
                System.out.println("Buzz");
            }
        } else {
            System.out.println("Mistake ");
        }
    }
}

