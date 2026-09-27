package model;

public class Pesawatekonomi extends Pesawat {

    public Pesawatekonomi(String kodePenerbangan, String maskapai,
                          String asal, String tujuan, double hargaDasar) {
        super(kodePenerbangan, maskapai, asal, tujuan, hargaDasar);
    }

    @Override
    public double hitungHargaTiket() {
        return getHargaDasar();
    }

    @Override
    public String getKelasLayanan() {
        return "Ekonomi";
    }

    @Override
    public String getFasilitas() {
        return "Snack ringan";
    }
}