import java.util.*;
import java.lang.Math;
class Bil {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int bil1, bil2, bil3;

        System.out.println("Masukkan bil1 = ");
        bil1 = input.nextInt();
        System.out.println("Masukkan bil2 = ");
        bil2 = input.nextInt();
        System.out.println("Masukkan bil3 = ");
        bil3 = input.nextInt();
        if (bil1 > bil2 && bil1 > bil3) {
            System.out.println("terbesar =" + bil1);
        } else {
            if (bil2 > bil3) {
                System.out.println("terbesar =" + bil2);
            } else {
                System.out.println("terbesar =" + bil3);
            }
        }
        if (bil1 < bil2 && bil1 < bil3) {
            System.out.println("terkecil =" + bil1);
        } else {
            if (bil2 < bil3) {
                System.out.println("terkecil =" + bil2);
            } else {
                System.out.println("terkecil =" + bil3);
            }
        }
    }
}
