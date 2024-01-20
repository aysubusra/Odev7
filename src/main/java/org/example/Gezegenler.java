package org.example;

public class Gezegenler {

    public static void main(String[] args) {
        // Güneş sistemi gezegenlerini listeleme
        for (Gezegen gezegen : Gezegen.values()) {
            System.out.println("Gezegen Adı: " + gezegen.isim);
            System.out.println("Sıralama: " + gezegen.siralama);
            System.out.println("Uzaklık: " + gezegen.uzaklik + " milyon km");
            System.out.println("Yarıçap: " + gezegen.yaricap + " km");
            System.out.println("Dönme Süresi: " + gezegen.donmeSuresi + " saat");
            System.out.println("------------------------------------");
        }
    }

}
