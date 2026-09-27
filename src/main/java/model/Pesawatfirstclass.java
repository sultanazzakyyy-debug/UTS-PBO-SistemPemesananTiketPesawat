package model;

public class Pesawatfirstclass extends Pesawat {

    private static final double TAMBAHAN_FIRSTCLASS = 1.0;

    public Pesawatfirstclass(String kodePenerbangan, String maskapai,
                             String asal, String tujuan, double hargaDasar) {
        super(kodePenerbangan, maskapai, asal, tujuan, hargaDasar);
    }

    @Override
    public double hitungHargaTiket() {
        return getHargaDasar() + (getHargaDasar() * TAMBAHAN_FIRSTCLASS);
    }

    @Override
    public String getKelasLayanan() {
        return "First Class";
    }

    @Override
    public String getFasilitas() {
        return "Lounge VIP + Antar Jemput Bandara";
    }
}