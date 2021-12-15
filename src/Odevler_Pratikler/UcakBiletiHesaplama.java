package Odevler_Pratikler;

import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        int range, age, typeOfTrip;
        double totalAmount, discountedAmount, ageDiscount, roundTripDiscount;
        double perKm = 0.1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        range = scanner.nextInt();
        System.out.print("Yaşınızı Giriniz: ");
        age = scanner.nextInt();
        System.out.print("Yolculuk Tipini Giriniz.\n1-Tek Yön\n2-Gidiş Dönüş : ");
        typeOfTrip = scanner.nextInt();

        if (typeOfTrip == 1){
            if (age < 0 || range < 0){
                System.out.println("Hatalı işlem yaptınız, tekrar deneyiniz.");
            }
            else if (age >= 0 && age < 12) {
                ageDiscount = 0.50;
                discountedAmount = range * perKm * ageDiscount;
                totalAmount = (range * perKm) - discountedAmount;
                System.out.println("Toplam Tutar: " + totalAmount + " TL");
            }
            else if (age > 12 && age < 24) {
                ageDiscount = 0.10;
                discountedAmount = range * perKm * ageDiscount;
                totalAmount = (range * perKm) - discountedAmount;
                System.out.println("Toplam Tutar: " + totalAmount + " TL");
            }
            else if (age > 65) {
                ageDiscount = 0.30;
                discountedAmount = range * perKm * ageDiscount;
                totalAmount = (range * perKm) - discountedAmount;
                System.out.println("Toplam Tutar: " + totalAmount + " TL");
            }
            else {
                totalAmount = range * perKm;
                System.out.println("Toplam Tutar: " + totalAmount + " TL");
            }

        }

        if (typeOfTrip == 2) {
            if (age < 0 || range < 0){
                System.out.println("Hatalı işlem yaptınız, tekrar deneyiniz.");
            }
            else if (age >= 0 && age < 12){
                ageDiscount = 0.50;
                discountedAmount = (range * perKm) - (range * perKm * ageDiscount);
                roundTripDiscount = discountedAmount * 0.20;
                totalAmount = (discountedAmount - roundTripDiscount) * 2;
                System.out.println("Toplam Tutar: " + totalAmount + " TL");
            }
            else if (age > 12 && age < 24) {
                ageDiscount = 0.10;
                discountedAmount = (range * perKm) - (range * perKm * ageDiscount);
                roundTripDiscount = discountedAmount * 0.20;
                totalAmount = (discountedAmount - roundTripDiscount) * 2;
                System.out.println("Toplam Tutar: " + totalAmount + " TL");
            }
            else if (age > 65) {
                ageDiscount = 0.30;
                discountedAmount = (range * perKm) - (range * perKm * ageDiscount);
                roundTripDiscount = discountedAmount * 0.20;
                totalAmount = (discountedAmount - roundTripDiscount) * 2;
                System.out.println("Toplam Tutar: " + totalAmount + " TL");
            }

            else {
                discountedAmount = (range * perKm);
                roundTripDiscount = discountedAmount * 0.20;
                totalAmount = (discountedAmount - roundTripDiscount) * 2;
                System.out.println("Toplam Tutar: " + totalAmount + " TL");
            }
        }
    }
}
