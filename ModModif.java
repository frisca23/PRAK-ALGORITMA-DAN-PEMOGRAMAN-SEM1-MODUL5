import java.util.Scanner;
public class ModModif {
  public static void main (String[] args)
  {
    Scanner input = new Scanner(System.in);
    int bil;
    System.out.print("Masukkan Bilangan = ");
    bil = input.nextInt();
    if (bil%2==0) {
    System.out.println("Bilangan Genap");
    } else {
    System.out.println("Bilangan Ganjil");
    }
  }
}

