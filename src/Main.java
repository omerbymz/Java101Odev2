import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                double tutar;
                double kdvOran = 0.18;
                Scanner input = new Scanner(System.in);
                System.out.print("Ücret miktarını giriniz: ");
                tutar = input.nextDouble();
                double kdvTutar = tutar * kdvOran;
                double toplam = tutar + kdvTutar;
                double kdvliTutar = tutar + kdvTutar;

                System.out.print("KDV'siz tutar: "+ tutar);
                System.out.println("KDV oranı: "+ kdvOran);
                System.out.println("KDV tutarı: " + kdvTutar);
                System.out.print("KDV'li tutar "+ kdvliTutar);


            }
}


