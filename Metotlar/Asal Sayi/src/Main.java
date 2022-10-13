import java.util.Scanner;

public class Main {

    static void prime(int number, int i) {

        if (number == i) {
            System.out.println(number + " Asal sayıdır");
            return;
        } else if (number % i == 0) {
            System.out.println(number + " Asal sayı değildir");
            return;
        }
        prime(number, i + 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        prime(number, 2);


    }
}