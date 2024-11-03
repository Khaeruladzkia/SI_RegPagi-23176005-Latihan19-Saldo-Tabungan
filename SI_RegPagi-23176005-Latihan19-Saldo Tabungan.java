/**
 * Nama                 : Khaerul Adzkia Alamsyah
 * Nim                  : 23176005
 * Prodi                : Sistem Informasi / Semester 3
 * Mata Kuliah          : PBO 1 / Pertemuan 6 / Latihan 19 - Saldo Tabungan
 * Deskripsi Program    : Menghitung dan mencetak saldo tabungan setiap bulan selama enam bulan,
                          berdasarkan saldo awal dan bunga bulanan sebesar 15%.
 * @author
 **/package pertemuan.pkg6;
public class Latihan19 {
     
    public static void main(String[] args) {
        double saldoAwal = 2500000;
        double bungaBulanan = 0.15; // 15%
        int lamaBulan = 6;

        for (int i = 1; i <= lamaBulan; i++) {
            saldoAwal += saldoAwal * bungaBulanan;
            System.out.printf("Saldo di bulan ke-%d Rp.%,.0f%n", i, saldoAwal);
        }
    }
}


