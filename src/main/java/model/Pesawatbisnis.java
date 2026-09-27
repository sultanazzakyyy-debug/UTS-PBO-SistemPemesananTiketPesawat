package model;

public class Pesawatbisnis extends Pesawat {

    private static final double TAMBAHAN_BISNIS = 0.5;

    public Pesawatbisnis(String kodePenerbangan, String maskapai,
                         String asal, String tujuan, double hargaDasar) {
        super(kodePenerbangan, maskapai, asal, tujuan, hargaDasar);
    }

    @Override
    public double hitungHargaTiket() {
        return getHargaDasar() + (getHargaDasar() * TAMBAHAN_BISNIS);
    }

    @Override
    public String getKelasLayanan() {
        return "Bisnis";
    }

    @Override
    public String getFasilitas() {
        return "Bagasi 30kg + Lounge";
    }
}