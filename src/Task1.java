import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите шестизначное число");
        int num = sc.nextInt();
        int num0 = num / 100000;
        int num1 = num / 10000 % 10;
        int num2 = num / 1000 % 10;
        int num3 = num / 100 % 10;
        int num4 = num / 10 % 10;
        int num5 = num % 10;
        if ((num0 + num1 + num2) == (num3 + num4 + num5)) {
            System.out.println("Счастливое число");
        } else if (num > 999999) {
            System.out.println("Введите шестизначное число");
        }
        else {
            System.out.println("Несчастливое число");
        }
    }
}
