/**
 *
 * @author ACER
 *NAMA              : Nurul Khafidoh
 *KELAS             : PBO RegPagi
 *NIM               : 22166012
 *DESKRIPSI PROGRAM : Program ini berisi program untuk 
 * menghitung saldo tabungan
 */
import java.util.Scanner;

public class SIRegPagi22166012Latihan19Saldo {
    
    public static void main(String[] args) {
        System.out.println("===== Tampilan saldo tabungan =====");
        Scanner input = new Scanner(System.in);
        
        //Masukkan variabel
        double saldoAwal = 2500000;
        double bunga = 0.15;
        int lama = 6;
        
        //menghitung saldo awal
        double saldo = saldoAwal;
        for (int i = 1; i <= lama; i++) {
            saldo+= saldo * bunga;
        
        //menampilkan hasil inputan
            System.out.println("Saldo anda bulan ke- " + i + " Rp " + saldo);
        }
    }
}
   
