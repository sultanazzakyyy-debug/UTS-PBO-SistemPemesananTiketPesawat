package model;

public class Penumpang {

    private static int jumlahPenumpang = 0;

    private String nama;
    private String noHp;
    private String noKursi;

    public Penumpang(String nama, String noHp) {
        this.nama = nama;
        this.noHp = noHp;
        jumlahPenumpang++;
        this.noKursi = bangkitkanNoKursi();
    }

    private String bangkitkanNoKursi() {
        // baris kursi A-D, tiap baris muat 4 penumpang biar sederhana
        char baris = (char) ('A' + ((jumlahPenumpang - 1) / 4));
        int nomor = ((jumlahPenumpang - 1) % 4) + 1;
        return baris + "" + nomor;
    }

    public String getNama() {
        return nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public String getNoKursi() {
        return noKursi;
    }
}