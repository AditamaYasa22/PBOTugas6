package bangundatar;

public class PersegiPanjang extends BangunDatar {

  private double panjang, lebar;

  public PersegiPanjang(double panjang, double lebar) {
    super(panjang, lebar);
    this.panjang = panjang;
    this.lebar = lebar;
  }

  public double getLuas() {
    return panjang * lebar;
  }

  public double getKeliling() {
    return 2 * (panjang + lebar);
  }
}
