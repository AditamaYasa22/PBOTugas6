package bangundatar;

public class SegitigaSikuSiku extends Segitiga {

    private double alas, tinggi, sisiMiring;

    public SegitigaSikuSiku(double alas, double tinggi, double sisiMiring) {
        super(alas, tinggi);
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    @Override
    public double getLuas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public double getKeliling() {
        return alas + tinggi + sisiMiring;
    }
}
