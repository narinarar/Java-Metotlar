import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }

    static int sub(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma: " + result);
        return result;
    }

    static int mult(int a, int b) {
        int result = a * b;
        System.out.println("Çarpımları: " + result);
        return result;
    }

    static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("İkinci sayı 0'dan farklı olmalı.");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölüm: " + result);
        return result;
    }
    static int power(int a, int b) {
        int result = 0;
        for (int i = 1; i <= b; i++) {
            result *= a;
            System.out.println("Üs alma işlemi: " + power());
        }
        return result;
    }
    static int mod(int a, int b) {
        return a % b;
    }

    static void calc(int a, int b) {
        System.out.println("Çevresi: " + (2 * (a + b)));
        System.out.println("Alanı: " + (a * b));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int select, a, b;

        String menu = "1. Toplama İşlemi\n"
                + "2. Çıkarma İşlemi\n"
                + "3. Çarpma İşlemi\n"
                + "4. Bölme İşlemi\n"
                + "5. üslü Sayı Hesaplama\n"
                + "6. Mod Alma\n"
                + "7. Dikdörtgen Alan ve Çevre Hesaplaması\n"
                + "0. Çıkış Yap";

        while (true) {
            System.out.println("\n" + menu);
            System.out.print("Bir işlem seçiniz: ");
            select = scanner.nextInt();

            if (select == 0) {
                break;
            }

            System.out.print("İlk sayıyı giriniz: ");
            a = scanner.nextInt();
            System.out.print("İkinci sayıyı giriniz:");
            b = scanner.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    sub(a, b);
                    break;
                case 3:
                    mult(a, b);
                    break;
                case 4:
                    divide(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    System.out.println("Mod işlemi: " + mod(a, b));
                    break;
                case 7:
                    calc(a, b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz.");
            }

        }
    }
}
