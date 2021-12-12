package Odevler_Pratikler;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int matematik,fizik,turkce,kimya,muzik;
        int toplamDers = 5;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        matematik = scanner.nextInt();
        int ders1 = (matematik > 100 || matematik < 0) ? toplamDers-- : matematik;
        // 100 den büyük veya sıfırdan küçük ise ortalamaya dahil etmez , uygun aralıkta ise ortalamaya dahil eder.

        System.out.print("Fizik Notunuz: ");
        fizik = scanner.nextInt();
        int ders2 = (fizik > 100 || fizik < 0 ) ? toplamDers-- : fizik;

        System.out.print("Türkçe Notunuz: ");
        turkce = scanner.nextInt();
        int ders3 = (turkce > 100 || turkce < 0 ) ? toplamDers-- : turkce;

        System.out.print("Kimya Notunuz: ");
        kimya = scanner.nextInt();
        int ders4 = (kimya > 100 || kimya < 0 ) ? toplamDers-- : kimya;

        System.out.print("Müzik Notunuz: ");
        muzik = scanner.nextInt();
        int ders5 = (muzik > 100 || muzik < 0 ) ? toplamDers-- : muzik;

        double average = (ders1 + ders2 + ders3 + ders4 + ders5) / toplamDers;

        if (average <= 55){
            System.out.println("Sınıfta kaldınız, seneye görüşmek üzere.");
        }
        else {
            System.out.println("Tebrikler sınıfı geçtiniz.");
        }

        System.out.println("Ortalamanız : " + average);

    }
}
