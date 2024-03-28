package bangundatar;

public class Persegi extends BangunDatar {

  private double sisi;

  public Persegi(double sisi) {
    super(sisi);
    this.sisi = sisi;
  }

  public double getLuas() {
    return sisi * sisi;
  }

  public double getKeliling() {
    return 4 * sisi;
  }
}
