package PatikaDevJava;
import java.util.Scanner;

/**
 * Ödev1 - NotHesaplama
 */
public class NotHesaplama {

    public static void main(String[] args) {
        int mat,fiz,kim,tur,tar,muz;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notu:");
        mat = input.nextInt();

        System.out.println("Fizik notu:");
        fiz= input.nextInt();

        System.out.println("Kimya notu:");
        kim= input.nextInt();

        System.out.println("Türkçe notu:");
        tur=input.nextInt();

        System.out.println("Tarih notu:");
        tar=input.nextInt();

        System.out.println("Müzik notu:");
        muz=input.nextInt();
        input.close();

        double ort = (mat+fiz+kim+tur+tar+muz)/6.0;
        System.out.println(ort>60? "Geçtiniz":"Kaldınız");
        
    }
}