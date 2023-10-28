/**
 *
 * @author ACER
 *NAMA              : Nurul Khafidoh
 *KELAS             : PBO RegPagi
 *NIM               : 22166012
 *DESKRIPSI PROGRAM : Program ini berisi program untuk
 * menampilkan program rata-rata nilai mahasiswa
 */

import java.util.Scanner;

public class SIRegPagi22166012Latihan21 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===== Tampilan program rata-rata nilai =====");
        //Inputkan variabel
        float jumlah, x,rata;
        
        //Memasukkan jumlah mahasiswa
        System.out.println("Masukkan Banyaknya Mahasiswa : ");
        
        //Menginputkan variabel yang akan digunakan dalam proses perhitungan
        int n = scanner.nextInt();
        jumlah = 0;
        int i=1;
        while (i <= n) {
            
        //menampilkan nilai mahasiswa sesuai urutan
        System.out.println("Nilai Mahasiswa ke-"+i+": ");
        
        //menginputkan variabel untuk menghitung rata-rata
        x = scanner.nextFloat();
        jumlah += x;
        i++;
        }
        rata= jumlah / n;
        
        //menampilkan rata-rata
        System.out.println("Maka, Rata-rata Nilainya adalah  : "+rata);
        }
}
