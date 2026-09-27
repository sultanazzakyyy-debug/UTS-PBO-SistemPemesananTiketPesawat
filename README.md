# Sistem Pemesanan Tiket Pesawat

Proyek UTS Pemrograman Berorientasi Objek (PBO) — Program Studi Sistem Informasi, Universitas Mulawarman.

Nama: Muhammad Nadhir Sultan Azzaky

NIM: 2509116080

Kelas: Sistem Informasi'B25

## Deskripsi Proyek

Program ini adalah aplikasi command-line sederhana untuk memesan tiket pesawat. Program menyimpan daftar penerbangan yang tersedia beserta kelas layanannya (Ekonomi, Bisnis, First Class), memungkinkan pengguna mencari penerbangan berdasarkan kota tujuan, memesan tiket atas nama seorang penumpang, lalu mencetak e-tiket lengkap dengan rincian harga.

Program ini dibuat untuk menerapkan konsep dasar OOP dalam Java, yaitu:
- **Inheritance** — class `Pesawatekonomi`, `Pesawatbisnis`, dan `Pesawatfirstclass` mewarisi class induk `Pesawat`.
- **Polymorphism (Method Overriding)** — tiap subclass pesawat meng-override method `hitungHargaTiket()`, `getKelasLayanan()`, dan `getFasilitas()` sehingga hasilnya berbeda-beda tergantung kelas layanan, meski dipanggil melalui referensi `Pesawat` yang sama.
- **Condition (if-else)** — digunakan untuk validasi input (nomor penerbangan, hasil pencarian, daftar tiket kosong).
- **Looping** — digunakan untuk menampilkan daftar penerbangan dan daftar tiket.

## Alur Program

1. Saat dijalankan, program otomatis mengisi tiga data penerbangan awal (`isiDataPenerbangan()`).
2. Menu utama akan tampil terus-menerus (loop `while`) sampai pengguna memilih keluar:
   ```
   1. Lihat Daftar Penerbangan
   2. Cari Penerbangan Berdasarkan Kota Tujuan
   3. Pesan Tiket
   4. Lihat Semua Tiket
   0. Keluar
   ```
3. **Menu 1 — Lihat Daftar Penerbangan**: menampilkan seluruh penerbangan beserta kode, maskapai, rute, kelas, dan harga.
4. **Menu 2 — Cari Penerbangan**: pengguna memasukkan nama kota tujuan, program menyaring daftar penerbangan yang cocok dan menampilkannya; jika tidak ada yang cocok, program memberi tahu bahwa penerbangan tidak ditemukan.
5. **Menu 3 — Pesan Tiket**: pengguna memilih nomor penerbangan dari daftar, lalu mengisi nama dan nomor HP. Program membuat objek `Penumpang` dan `Tiket`, kemudian mencetak e-tiket berisi kode tiket, data penumpang, nomor kursi, info penerbangan, dan total harga.
6. **Menu 4 — Lihat Semua Tiket**: menampilkan seluruh tiket yang sudah pernah dipesan selama program berjalan.
7. **Menu 0 — Keluar**: menghentikan program.

### Cara Menjalankan

1. Buka project di NetBeans (atau IDE Java lain yang mendukung Maven).
2. Pastikan **Main Class** pada properti project mengarah ke `main.Main`.
3. Jalankan project (Run Project / F6).
4. Ikuti menu yang tampil di konsol.

## Penjelasan Gambar (Screenshot Output)

*(Tempelkan screenshot hasil run program di bagian ini, lalu sesuaikan penjelasan singkatnya)*

1. Menu awal

<img width="491" height="180" alt="image" src="https://github.com/user-attachments/assets/3525e23c-5418-4d2a-9127-f1adff149e5b" />

Ini merupakan tampilan awal ketika user menjalankan program yang dimana sistem akan langsung otomatis menunjukkan tampilan menu dengan 5 pilihan (1-4 dan 0) saat program pertama kali dijalankan.

2. Menu 1

<img width="410" height="82" alt="image" src="https://github.com/user-attachments/assets/1afdb4ac-f496-4ec3-ae4d-1b420344a16d" />

 Ketika user memilih menu 1, maka sistem akan mengirimkan output berisikan 3 penerbangan contoh (Ekonomi, Bisnis, First Class) lengkap dengan harganya masing-masing.

3. Menu 2

<img width="356" height="89" alt="image" src="https://github.com/user-attachments/assets/056b0daf-5515-4fb6-bdcf-abaa40b5f262" />

Ketika user memilih menu 2, maka sistem akan menanyakan terlebih dahulu kepada user. User diminta untuk memasukkan nama kota tujuan yang ingin dicari. Setelah user memasukkan nama kota tujuan maka muncul lah output nomor tiket, nama pesawat, kota asal > kota tujuan, kelas, dan harga tiket.

4. Menu 3

<img width="387" height="276" alt="image" src="https://github.com/user-attachments/assets/1d593b99-549b-48a5-8d47-7ac0376f4e76" />

Ketika user memilih menu 3, sistem akan memberikan output yang dimana user harus mengisi ketentuan yang ada diprogram ini, yaitu Nama dan No. HP. Setelah itu muncul hasil e-tiket yang tercetak (kode tiket, nomor kursi, dan total bayar).
   
5. Menu 4

<img width="294" height="63" alt="image" src="https://github.com/user-attachments/assets/7cda38e4-93db-4819-8da3-baa7ea2a1788" />

Ketika user memilih menu 4, maka sistem akan memunculkan output daftar tiket yang sebelumnya dipesan oleh user.

6. Menu 0

<img width="377" height="113" alt="image" src="https://github.com/user-attachments/assets/47ea0a73-716c-440f-b967-dfcd2db5ec5c" />

Ketika user memilih menu 0, maka sistem akan berhenti atau selesai.
