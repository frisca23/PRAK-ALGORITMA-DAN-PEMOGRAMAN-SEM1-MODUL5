class ModifB {
   public static void main(String[] args)
   {
	 Scanner input = new Scanner(System.in);
     System.out.print("Masukkan Bilangan = " );
     bil = input.nextInt();

     if (bil % 2 == 0){
       System.out.println("Bilangan genap");
     } else {
       System.out.println("Bilangan ganjil");
   }
 }
}
