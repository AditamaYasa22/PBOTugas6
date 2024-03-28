package bangunruang;

public class Tabung extends BangunRuang {

  private double jarijari, tinggi;

  public Tabung(double jarijari, double tinggi) {
    this.jarijari = jarijari;
    this.tinggi = tinggi;
  }

  @Override
  public double getVolume() {
    return Math.PI * jarijari * jarijari * tinggi;
  }

  @Override
  public double getLuasPermukaan() {
    return 2 * Math.PI * jarijari * (jarijari + tinggi);
  }
}

