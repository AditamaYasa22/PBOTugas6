package bangunruang;

import bangundatar.Persegi;

public class Kubus extends BangunRuang {

  private double sisi;

  public Kubus(double sisi) {
    this.sisi = sisi;
  }

  public double getVolume() {
    return sisi * sisi * sisi;
  }

  public double getLuasPermukaan() {
    Persegi alas = new Persegi(sisi);
    return 6 * alas.getLuas(); 
}
}