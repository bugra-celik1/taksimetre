import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
  int km;
  double perKm = 2.20, startPrice = 10, total;

  Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz:");
        km = inp.nextInt();

        total = (km * perKm);
        total += startPrice;

        total = (total < 20 ) ? 20 : total;

        System.out.println("Toplam tutar :" + total);





    }
}