package bangundatar;

public class SegitigaSamaKaki extends Segitiga {

  private double alas, tinggi;

  public SegitigaSamaKaki(double alas, double tinggi) {
    super(alas, tinggi, alas);
    this.alas = alas;
    this.tinggi = tinggi;
  }

  public double getLuas() {
    return (alas * tinggi) / 2;
  }

  public double getKeliling() {
    double sisiMiring = Math.sqrt(tinggi * tinggi + (alas / 2) * (alas / 2));
    return alas + 2 * sisiMiring;
  }
}
