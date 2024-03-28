package bangundatar;

public class SegitigaSamaSisi extends Segitiga {

  private double sisi;

  public SegitigaSamaSisi(double sisi) {
    super(sisi, sisi, sisi);
    this.sisi = sisi;
  }

  public double getLuas() {
    return Math.sqrt(3) * sisi * sisi / 4;
  }

  public double getKeliling() {
    return 3 * sisi;
  }
}
