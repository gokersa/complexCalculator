import java.util.Scanner;

public class complex_calculator {

    static void plus(){
        Scanner scan =new Scanner(System.in);
        int number, result=0, i=1;
        while(true){
            System.out.print(i++ + "sayı: ");
            number = scan.nextInt();
            if(number==0){
                break;
            }
            result += number;
        }
        System.out.print("Sonuç: " + result);

    }

    static void minus(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);

    }

    static void times(){
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);

    }

    static void power(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);

    }

    static void factorial(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void mod(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Modu alınacak sayıyı giriniz :");
        int modA = scan.nextInt();
        System.out.print("Mod sayısını giriniz:");
        int modB = scan.nextInt();
        int result = modA%modB;
        System.out.println("Sonuç : " + result);
    }



    static void rectangle(){
        Scanner scan =new Scanner(System.in);
        System.out.print("İlk kenar uzunluğunu girin: ");
        int cornerFirst = scan.nextInt();
        System.out.print("İkinci kenar uzunluğunu girin: ");
        int cornerSecond = scan.nextInt();
        int area,circumference;
        area = cornerFirst*cornerSecond;
        circumference = 2*(cornerFirst+cornerSecond);
        System.out.println("Dikdörtgenin çevresi: " + area);
        System.out.println("Dikdörtgenin alanı: " + circumference);
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1-Toplama İşlemi:\n" +
                "2.Çıkarma işlemi:\n" +
                "3-Çarpma İşlemi:\n" +
                "4-Bölme İşlemi:\n" +
                "5-Üslü Sayı Hesaplama :\n" +
                "6-Faktöriyel Alma:\n" +
                "7-Mod Alma:\n" +
                "8-Diktörtgen Alan ve Çevre Hesabı:\n" +
                "0-Çıkış";
        System.out.print(menu);
        select = scan.nextInt();
        switch (select){
            case 1:
                plus();
                break;

            case 2:
                minus();
                break;
            case 3:
                times();
                break;
            case 4:
                divided();
                break;
            case 5:
                power();
                break;
            case 6:
                factorial();
                break;
            case 7:
                mod();
                break;
            case 8:
                rectangle();
                break;
            case 0:
                break;
            default:
                System.out.print("Yanlış bir değer girdiniz. Lütfen tekrar deneyiniz.");

        }

    }
}
