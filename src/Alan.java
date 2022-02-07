import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Alan {
    public static void main(String[] args) {
        double a, b, c, u, alan;

        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin İlk Kenarını Giriniz:");
        a = input.nextDouble();
        System.out.print("Üçgenin İkinci Kenarını Giriniz:");
        b = input.nextDouble();
        System.out.print("Üçgenin Üçüncü Kenarını Giriniz:");
        c = input.nextDouble();

        u = (a + b + c)/2;
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Üçgenin Alanı: " + alan);
    }
}
