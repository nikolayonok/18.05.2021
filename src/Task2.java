import java.util.Scanner;

public class Task2 {
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
        if (num >= 100000 && num <= 999999) {
            System.out.print(num5);
            System.out.print(num4);
            System.out.print(num2);
            System.out.print(num3);
            System.out.print(num1);
            System.out.print(num0);
        } else System.out.println("Ошибка");
    }

}

