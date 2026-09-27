package model;

public class Tiket {

    private static int counter = 1000;
    private static final double BIAYA_ADMIN = 25000;

    private String kodeTiket;
    private Penumpang penumpang;
    private Pesawat pesawat;

    public Tiket(Penumpang penumpang, Pesawat pesawat) {
        counter++;
        this.kodeTiket = "TKT-" + counter;
        this.penumpang = penumpang;
        this.pesawat = pesawat;
    }

    public String getKodeTiket() {
        return kodeTiket;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public Pesawat getPesawat() {
        return pesawat;
    }

    public double getTotalBayar() {
        return pesawat.hitungHargaTiket() + BIAYA_ADMIN;
    }

    public void cetakTiket() {
        System.out.println("==================================");
        System.out.println("           E-TIKET PESAWAT");
        System.out.println("==================================");
        System.out.println("Kode Tiket : " + kodeTiket);
        System.out.println("Penumpang  : " + penumpang.getNama());
        System.out.println("No. HP     : " + penumpang.getNoHp());
        System.out.println("No. Kursi  : " + penumpang.getNoKursi());
        System.out.println("----------------------------------");
        pesawat.tampilkanInfo();
        System.out.println("----------------------------------");
        System.out.printf("Biaya Admin : Rp%,.0f%n", BIAYA_ADMIN);
        System.out.printf("Total Bayar : Rp%,.0f%n", getTotalBayar());
        System.out.println("==================================");
    }
}