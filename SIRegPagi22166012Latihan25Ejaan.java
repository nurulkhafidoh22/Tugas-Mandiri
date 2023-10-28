/**
 *
 * @author ACER
 *NAMA              : Nurul Khafidoh
 *KELAS             : PBO RegPagi
 *NIM               : 22166012
 *DESKRIPSI PROGRAM : Program ini berisi program untuk
 * ejaan nama
 */

import java.util.Scanner;

public class SIRegPagi22166012Latihan25Ejaan {
    public static void main(String[] args) {
        
        System.out.println("===== Tampilan Ejaan Nama =====");
        Scanner input = new Scanner(System.in);
      
        // Menginputkan nama depan
        System.out.print("Masukkan nama depan anda untuk dieja : ");
        String namaDepan = input.nextLine();
        
        // Menampilka hasil akhir program
        System.out.println("Ejaan untuk \"" + namaDepan + "\" adalah:");

        for (int i = 0; i < namaDepan.length(); i++) {
            char huruf = namaDepan.charAt(i);
            int urutan = i + 1;
            System.out.println("Huruf ke-" + urutan + ": " + huruf);
        }
    }
}

    
