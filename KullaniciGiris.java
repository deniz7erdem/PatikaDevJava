import java.util.Scanner;
/**
 * Ödev - Kullanici Giris
 */
public class KullaniciGiris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password, resetReq, newPass, userPass;
        userPass = "erdem";
        resetReq="e";
        while (resetReq.equals("e")) {
            System.out.println("Kullanici Adı:");
            userName = input.nextLine();
            System.out.println("Şifre:");
            password = input.nextLine();

            if (userName.equals("deniz") && password.equals(userPass)) {
                System.out.println("Giriş Başarılı!");
            } else {
                System.out.println("Şifre hatalı! Sıfırlamak ister misiniz?(e-h):");
                resetReq = input.nextLine();
                if (resetReq.equals("e")) {
                    System.out.println("Yeni Şifrenizi Girin:");
                    newPass = input.nextLine();
                    if (newPass.equals(userPass)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        userPass = newPass;
                        System.out.println("Şifre oluşturuldu.");
                    }

                }
            }

        }
        input.close();

    }

}