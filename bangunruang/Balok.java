package bangunruang;

import bangundatar.PersegiPanjang;

public class Balok extends BangunRuang {

    private double panjang, lebar, tinggi;
  
    public Balok(double panjang, double lebar, double tinggi) {
      this.panjang = panjang;
      this.lebar = lebar;
      this.tinggi = tinggi;
    }
  
    public double getVolume() {
      return panjang * lebar * tinggi;
    }
  
    public double getLuasPermukaan() {
      double luasAlas = panjang * lebar;
      double kelilingAlas = 2 * (panjang + lebar);
      return 2 * luasAlas + 2 * tinggi * kelilingAlas;
    }
  }
  
  
