package org.example;

public class GezegenMars {

    public static void main(String[] args) {

        Gezegen gezegen = Gezegen.MARS;

        System.out.println("Gezegen Bilgileri:");
        System.out.println("İsim: " + gezegen.isim);
        System.out.println("Sıralama: " + gezegen.siralama);
        System.out.println("Uzaklık (milyon km): " + gezegen.uzaklik);
        System.out.println("Yarıçap (km): " + gezegen.yaricap);
        System.out.println("Dönme Süresi (saat): " + gezegen.donmeSuresi);
    }
}
