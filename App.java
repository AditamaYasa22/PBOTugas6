import bangundatar.*;
import bangunruang.*;

public class App {
    public static void main(String[] args) {
        Shape persegiPanjang = new PersegiPanjang(5, 4);
        Shape persegi = new Persegi(5);
        Shape lingkaran = new Lingkaran(7);
        Shape segitigaSamaKaki = new SegitigaSamaKaki(6, 5);
        Shape segitigaSamaSisi = new SegitigaSamaSisi(5);
        Shape segitigaSikuSiku = new SegitigaSikuSiku(3, 4, 8);
        Shape segitigaSembarang = new SegitigaSembarang(4, 5, 6);

        Geometri kubus = new Kubus(5);
        Geometri balok = new Balok(5, 4, 3);
        Geometri bola = new Bola(7);
        Geometri tabung = new Tabung(7, 10);

        System.out.println("=== Bentuk Datar ===");
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.getLuas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.getKeliling());
        System.out.println("\nLuas Persegi: " + persegi.getLuas());
        System.out.println("Keliling Persegi: " + persegi.getKeliling());
        System.out.println("\nLuas Lingkaran: " + String.format("%.2f", lingkaran.getLuas()));
        System.out.println("Keliling Lingkaran: " + String.format("%.2f", lingkaran.getKeliling()));
        System.out.println("\nLuas Segitiga Sama Kaki: " + segitigaSamaKaki.getLuas());
        System.out.println("Keliling Segitiga Sama Kaki: " + segitigaSamaKaki.getKeliling());
        System.out.println("\nLuas Segitiga Sama Sisi: " + String.format("%.2f", segitigaSamaSisi.getLuas()));
        System.out.println("Keliling Segitiga Sama Sisi: " + segitigaSamaSisi.getKeliling());
        System.out.println("\nLuas Segitiga Siku-Siku: " + segitigaSikuSiku.getLuas());
        System.out.println("Keliling Segitiga Siku-Siku: " + segitigaSikuSiku.getKeliling());
        System.out.println("\nLuas Segitiga Sembarang: " + String.format("%.2f", segitigaSembarang.getLuas()));
        System.out.println("Keliling Segitiga Sembarang: " + segitigaSembarang.getKeliling());

        System.out.println("\n=== Bangun Ruang ===");
        System.out.println("Volume Kubus: " + kubus.getVolume());
        System.out.println("Volume Balok: " + balok.getVolume());
        System.out.println("Volume Bola: " + String.format("%.2f", bola.getVolume()));
        System.out.println("Volume Tabung: " + String.format("%.2f",tabung.getVolume()));
    }
}