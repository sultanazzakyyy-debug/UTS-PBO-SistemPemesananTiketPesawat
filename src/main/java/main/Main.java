package main;

import java.util.ArrayList;
import java.util.Scanner;
import model.Pesawat;
import model.Pesawatbisnis;
import model.Pesawatekonomi;
import model.Pesawatfirstclass;
import model.Penumpang;
import model.Tiket;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Pesawat> daftarPenerbangan = new ArrayList<>();
    private static final ArrayList<Tiket> daftarTiket = new ArrayList<>();

    public static void main(String[] args) {
        isiDataPenerbangan();

        boolean berjalan = true;
        while (berjalan) {
            System.out.println("\n===== SISTEM PEMESANAN TIKET PESAWAT =====");
            System.out.println("1. Lihat Daftar Penerbangan");
            System.out.println("2. Cari Penerbangan Berdasarkan Kota Tujuan");
            System.out.println("3. Pesan Tiket");
            System.out.println("4. Lihat Semua Tiket");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> tampilkanPenerbangan(daftarPenerbangan);
                case 2 -> cariPenerbanganBerdasarkanTujuan();
                case 3 -> pesanTiket();
                case 4 -> tampilkanSemuaTiket();
                case 0 -> {
                    berjalan = false;
                    System.out.println("\nTerima kasih telah menggunakan sistem ini!");
                }
                default -> System.out.println("\nPilihan tidak valid!");
            }
        }
        scanner.close();
    }

    private static void isiDataPenerbangan() {
        daftarPenerbangan.add(new Pesawatekonomi("EK-102", "Lion Air",
                "Samarinda", "Jakarta", 950000));
        daftarPenerbangan.add(new Pesawatbisnis("LN-303", "Batik Air",
                "Balikpapan", "Surabaya", 1350000));
        daftarPenerbangan.add(new Pesawatfirstclass("GA-501", "Garuda Indonesia",
                "Jakarta", "Makassar", 1800000));
    }

    private static void tampilkanPenerbangan(ArrayList<Pesawat> data) {
        System.out.println("\n---------- DAFTAR PENERBANGAN ----------");
        if (data.isEmpty()) {
            System.out.println("Tidak ada data penerbangan.");
        } else {
            for (int i = 0; i < data.size(); i++) {
                Pesawat p = data.get(i);
                System.out.printf("%d. %s | %s | %s -> %s | %s | Rp%,.0f%n",
                        (i + 1), p.getKodePenerbangan(), p.getMaskapai(),
                        p.getAsal(), p.getTujuan(), p.getKelasLayanan(),
                        p.hitungHargaTiket());
            }
        }
        System.out.println("-----------------------------------------");
    }

    private static void cariPenerbanganBerdasarkanTujuan() {
        System.out.print("\nMasukkan kota tujuan yang dicari: ");
        String tujuan = scanner.nextLine();

        ArrayList<Pesawat> hasil = new ArrayList<>();
        for (Pesawat p : daftarPenerbangan) {
            if (p.getTujuan().equalsIgnoreCase(tujuan)) {
                hasil.add(p);
            }
        }

        if (hasil.isEmpty()) {
            System.out.println("Tidak ditemukan penerbangan menuju \"" + tujuan + "\".");
        } else {
            tampilkanPenerbangan(hasil);
        }
    }

    private static void pesanTiket() {
        tampilkanPenerbangan(daftarPenerbangan);
        System.out.print("\nPilih nomor penerbangan: ");
        int nomor = scanner.nextInt();
        scanner.nextLine();

        if (nomor < 1 || nomor > daftarPenerbangan.size()) {
            System.out.println("Nomor penerbangan tidak ada!");
            return;
        }
        Pesawat pesawatDipilih = daftarPenerbangan.get(nomor - 1);

        System.out.print("Nama penumpang : ");
        String nama = scanner.nextLine();
        System.out.print("No. HP         : ");
        String noHp = scanner.nextLine();

        Penumpang penumpang = new Penumpang(nama, noHp);
        Tiket tiket = new Tiket(penumpang, pesawatDipilih);
        daftarTiket.add(tiket);

        System.out.println("\nPemesanan berhasil! Berikut e-tiket Anda:");
        tiket.cetakTiket();
    }

    private static void tampilkanSemuaTiket() {
        if (daftarTiket.isEmpty()) {
            System.out.println("\nBelum ada tiket yang dipesan.");
            return;
        }
        System.out.println("\n---------- DAFTAR TIKET ----------");
        for (int i = 0; i < daftarTiket.size(); i++) {
            Tiket t = daftarTiket.get(i);
            System.out.printf("%d. %s | %s | %s | %s | Rp%,.0f%n",
                    (i + 1), t.getKodeTiket(), t.getPenumpang().getNama(),
                    t.getPesawat().getKodePenerbangan(),
                    t.getPesawat().getKelasLayanan(),
                    t.getTotalBayar());
        }
        System.out.println("------------------------------------");
    }
}