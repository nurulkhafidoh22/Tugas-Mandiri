/**
 *
 * @author ACER
 *NAMA              : Nurul Khafidoh
 *KELAS             : PBO RegPagi
 *NIM               : 22166012
 *DESKRIPSI PROGRAM : Program ini berisi program untuk
perbandingan dua buah nilai
 */

import java.util.Scanner;

public class SIRegPagi22166012Latihan24Perbandingan {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //variabel yang digunakan untuk mengulang program
        char ulangi;
        
        //judul
        System.out.println("============Program Perbandingan Nilai===========");

        //menginputkan nilai pertama dan kedua
        do {
            System.out.print("Masukkan nilai pertama: ");
            double nilai1 = input.nextDouble();
            System.out.print("Masukkan nilai kedua: ");
            double nilai2 = input.nextDouble();

            //proses perhitungan dengan menggunakan perintah if else if dan else
            if (nilai1 < nilai2) {
                System.out.println("Hasil : " + nilai1 + " Lebih kecil dari " + nilai2);
            } else if (nilai1 > nilai2) {
                System.out.println("Hasil : " + nilai1 + " Lebih besar dari " + nilai2);
            } else {
                System.out.println("Hasil : " + nilai1 + " Sama dengan " + nilai2);
            }

            //penawaran untuk mengulangi program
            System.out.println();
            System.out.print("Ulangi Aktivitas? (Ya/Tidak): ");
            ulangi = input.next().charAt(0);

        } while (ulangi == 'y' || ulangi == 'Y');
    }
}

