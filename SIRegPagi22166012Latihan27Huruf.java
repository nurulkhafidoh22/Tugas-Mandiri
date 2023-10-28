/**
 *
 * @author ACER
 *NAMA              : Nurul Khafidoh
 *KELAS             : PBO RegPagi
 *NIM               : 22166012
 *DESKRIPSI PROGRAM : Program ini berisi program untuk menampilkan
 * formatting huruf besar dan kecil
 */

import java.util.Scanner;
        
public class SIRegPagi22166012Latihan27Huruf {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("===== Tampilan Huruf Besar Kecil =====");
        
        // untuk memasukkan kalimat
        System.out.println("Masukkan Kalimat : ");
        String kalimat = input.nextLine();
        
        //konversi ke huruf kapital
        String hurufKapital = kalimat.toUpperCase();
        
        //konversi ke huruf kecil
        String hurufKecil = kalimat.toLowerCase();
        
        //judul
        System.out.println("=====Hasil Formatting=====");
        
        //menampilkan output
        System.out.println("Huruf besar/kapital : " + hurufKapital);
        System.out.println("Huruf kecil : " + hurufKecil);
    }
    
}
