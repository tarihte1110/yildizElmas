import java.util.Scanner;
public class yildizElmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Elmasın yüksekliğini belirten sayı cinsinden uzunluğu giriniz:");
        int h = input.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int k = 1; k <= (h - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

            for (int x = h - 1; x >= 1; x--) {

                for (int d = 1; d <= (h - x); d++) {
                    System.out.print(" ");
                }
                for (int f = 1; f <= (2 * x) - 1; f++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
