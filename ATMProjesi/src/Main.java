import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı ismini kaydetmek için giriniz : ");
        String isim = input.next();

        System.out.println("Kullanıcı parolasını kaydetmek için giriniz : ");
        String parola = input.next();



        ATM atmReferansi = new ATM();
        Hesap hesap = new Hesap(isim, parola, 0);

        atmReferansi.calis(hesap);


        System.out.println("Programdan Cikiliyor...");

    }

}