import java.util.Scanner;
public class hipotenus {
    public static void main(String[] args) {
        //değişkenler
        int a, b;
        double c;
        //kullanıcı verileri
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz(cm): ");
        a = girdi.nextInt();
        System.out.print("2. Kenarı Giriniz(cm): ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs: " + c+" cm");
    }
}
