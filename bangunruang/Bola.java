package bangunruang;

public class Bola extends BangunRuang {

  private double jarijari;

  public Bola(double jarijari) {
    this.jarijari = jarijari;
  }

  public double getVolume() {
    return (4.0 / 3.0) * Math.PI * jarijari * jarijari * jarijari;
  }

  public double getLuasPermukaan() {
    return 4 * Math.PI * jarijari * jarijari;
  }
}
