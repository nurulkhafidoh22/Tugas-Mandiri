/**
 *
 * @author ACER
 *NAMA              : Nurul Khafidoh
 *KELAS             : PBO RegPagi
 *NIM               : 22166012
 *DESKRIPSI PROGRAM : Program ini berisi program untuk menampilkan
 * nilai terbesar dan nilai terkecil
 */

import java.util.Scanner;

public class SIRegPagi22166012Latihan23 {

    public static void main(String[] args) {
        //judul
        System.out.print("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====\n");
        Scanner input = new Scanner(System.in);
        
        //Memasukkan nama petugas
        System.out.print("Masukkan nama petugas: ");
        String nama = input.next();
        
        //Memasukkan banyaknya nilai yang akan dieksekusi
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
        int jumlahAngka = input.nextInt();

        //Memasukkan perintah 
        if (jumlahAngka <= 0) {
        System.out.println("Jumlah angka harus lebih dari 0.");
        return;
        }
        
        //Variabel yang digunakan 
        int angka;
        int nilaiTerbesar = Integer.MIN_VALUE;
        int nilaiTerkecil = Integer.MAX_VALUE;

        //Proses eksekusi untuk memperoleh nilai terbesar dan terkecil
        for (int i = 1; i <= jumlahAngka; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + ": ");
            angka = input.nextInt();

            if (angka > nilaiTerbesar) {
                nilaiTerbesar = angka;
            }

            if (angka < nilaiTerkecil) {
                nilaiTerkecil = angka;
            }
        }
        
        //judul
        System.out.println("======Hasil Nilai Mahasiswa=====");
        
        //Output berupa nilai terbesar dan terkecil
        System.out.println("Nilai terbesar: " + nilaiTerbesar);
        System.out.println("Nilai terkecil: " + nilaiTerkecil);
        
        //menghasilkan nama petugas program
        System.out.println("Petugas : "+ nama);
    }
}
