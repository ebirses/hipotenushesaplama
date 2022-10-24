import java.util.Scanner;
public class alanbulma {
    public static void main(String[] args) {
        //değişkenler
        int a, b, c;
        double alan, u;
        //kullanıcı verileri
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz(cm): ");
        a = girdi.nextInt();
        System.out.print("2. Kenarı Giriniz(cm): ");
        b = girdi.nextInt();
        System.out.print("3. Kenarı Giriniz(cm): ");
        c = girdi.nextInt();


        //u = Math.sqrt((a*a) + (b*b));
        u = ((a+b+c)/2);
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Hipotenüs: " +alan+" cm");
    }
}
