import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца ");
        int m = sc.nextInt();
        if (m <= 0 || m > 12) {
            System.out.println("Mistake ");
        }
        switch (m) {
            case 1:
                System.out.println("Winter/January");
                break;
            case 2:
                System.out.println("Winter/February");
                break;
            case 3:
                System.out.println("Spring/March");
                break;
            case 4:
                System.out.println("Spring/April");
                break;
            case 5:
                System.out.println("Spring/May");
                break;
            case 6:
                System.out.println("Summer/June");
                break;
            case 7:
                System.out.println("Summer/Jule");
                break;
            case 8:
                System.out.println("Summer/August");
                break;
            case 9:
                System.out.println("Autumn/September");
                break;
            case 10:
                System.out.println("Autumn/October");
                break;
            case 11:
                System.out.println("Autumn/November");
                break;
            case 12:
                System.out.println("Winter/Desember");
                break;
        }

    }
}
