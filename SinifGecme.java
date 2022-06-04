package Hesaplamalar;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {

        int matematik,fizik,turkce,kimya,muzik;
        double average;

        Scanner input=new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz : ");
        matematik=input.nextInt();
            if (matematik<0 || matematik>100){
             matematik = 0;

        }

        System.out.println("Fizik notunuzu giriniz : ");
        fizik=input.nextInt();
            if (fizik<0 || fizik>100){
             fizik = 0;
        }

        System.out.println("Turkce notunuzu giriniz : ");
        turkce=input.nextInt();
            if (turkce<0 || turkce>100){
             turkce = 0;
        }

        System.out.println("Kimya notunuzu giriniz : ");
        kimya =input.nextInt();
            if (kimya<0 || kimya>100){
             kimya = 0;
        }

        System.out.println("Muzik notunuzu giriniz : ");
        muzik=input.nextInt();
            if (muzik<0 || muzik>100){
             muzik = 0;
        }

        average=(matematik+fizik+turkce+kimya+muzik)/5;
        System.out.println(average);

        if (average>=55){
            System.out.println("Tebrikler! Sinifi Gectiniz");
        }else {
            System.out.println("Maalesef Sinifta Kaldiniz");
        }


        }

    }

