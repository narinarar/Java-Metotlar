import java.util.Scanner;

public class Main {

    static int negative(int number) {
        if (number <= 0) {
            return number;
        }
        else {
            System.out.print(number + " ");
            return negative(number - 5);
        }
    }

    static int positive (int number, int number2) {
        if (number > number2) {
            return number;
        }
        else {
            System.out.print(number + " ");
            return positive(number + 5, number2);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        positive(negative(number),number);
    }

    /*Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
    Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
    Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
    Yine her ekleme işleminde sayının son değerini ekrana yazdırın */
}