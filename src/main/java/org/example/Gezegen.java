package org.example;

public enum Gezegen {
    MERCURY("Merkür", 1, 57.9, 2439.7, 1407.6),
    VENUS("Venüs", 2, 108.2, 6051.8, 5832.5),
    EARTH("Dünya", 3, 149.6, 6371, 24),
    MARS("Mars", 4, 227.9, 3389.5, 24.6),
    JUPITER("Jüpiter", 5, 778.3, 71492, 9.9),
    SATURN("Satürn", 6, 1427, 60268, 10.7),
    URANUS("Uranüs", 7, 2871, 25559, 17.2),
    NEPTUNE("Neptün", 8, 4497, 24764, 16.1);

    private String isim;
    private int siralama;
    private double uzaklik; // milyon km
    private double yaricap; // km
    private double donmeSuresi; // saat


    Gezegen(String isim, int siralama, double uzaklik, double yaricap, double donmeSuresi) {
        this.isim = isim;
        this.siralama = siralama;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

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
