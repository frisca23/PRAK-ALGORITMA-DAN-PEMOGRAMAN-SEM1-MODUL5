import java.util.Scanner;
public class PredikatKelulusan
{
   public static void main (String[] args)
   {
     Scanner input = new Scanner (System.in);
     System.out.print("Masukkan IPK = ");
     double IPK = input.nextDouble();
     if (IPK >= 2.75 && IPK <= 2.99)
     {
        System.out.println ("Memuaskan");
     } else {
     if (IPK >= 3.00 && IPK <= 3.50)
     {
        System.out.println ("Sangat Memuaskan");
     } else {
     if (IPK >= 3.51 && IPK < 4.00)
     {
        System.out.println ("Dengan Pujian");
     } else {
        System.out.println("IPK tidak valid");
        }
     }
    }
  }
}
