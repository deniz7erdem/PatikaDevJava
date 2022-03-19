import java.util.Scanner;

/**
 * Ödev2 - KDV Hesaplama
 */
public class KDVHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ürün Fiyatını Girin:");
        double fiyat = input.nextDouble();
        input.close();
        double satisFiyat= (fiyat<1000)?fiyat*1.18:fiyat*1.08;
        double kdv = (fiyat<1000)?fiyat*0.18:fiyat*0.08;
        System.out.println("KDV'siz Fiyat: "+ fiyat + "\nKDV Dahil Fiyat:" + satisFiyat + "\nKDV Tutarı:"+ kdv);



    }
}
