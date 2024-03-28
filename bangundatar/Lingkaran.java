package bangundatar;

public class Lingkaran extends BangunDatar {

    private double jarijari;
  
    public Lingkaran(double jarijari) {
      super(jarijari);
      this.jarijari = jarijari;
    }
  
    public double getLuas() {
      return Math.PI * jarijari * jarijari;
    }
  
    public double getKeliling() {
      return 2 * Math.PI * jarijari;
    }
  }
  
