package Odevler_Pratikler;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String username,password,newPassword;
        int select_reset;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        username = scanner.nextLine();
        System.out.print("Şifreniz: ");
        password = scanner.nextLine();

        if (username.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız");
        }
        else {
            System.out.println("Bilgileriniz Yanlış !");
        }

        System.out.println("Şifrenizi Sıfırlamak İster Misiniz?\n1-Evet\n2-Hayır");
        select_reset = scanner.nextInt();

            if (select_reset == 1) {
                System.out.println("Yeni şifre ile eski şifre aynı olmamalı.");
                System.out.print("Yeni Şifreniz: ");
                newPassword = scanner.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else {
                    System.out.println("Yeni şifre oluşturuldu.");
                }
            }

            else if (select_reset == 2){
                System.out.println("Sistemden çıkış yapıyorsunuz...");
            }
            else {
                System.out.println("Yanlış İşlem Seçtiniz...");
            }

        }
    }

