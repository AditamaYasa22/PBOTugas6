package bangundatar;

public class SegitigaSembarang extends Segitiga {

  private double sisiA, sisiB, sisiC;

  public SegitigaSembarang(double sisiA, double sisiB, double sisiC) {
    super(sisiA, sisiB, sisiC);
    this.sisiA = sisiA;
    this.sisiB = sisiB;
    this.sisiC = sisiC;
  }

  public double getLuas() {
    double s = (sisiA + sisiB + sisiC) / 2;
    double K = Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC));
    return K;
  }

  public double getKeliling() {
    return sisiA + sisiB + sisiC;
  }
}
