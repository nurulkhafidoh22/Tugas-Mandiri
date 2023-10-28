/**
 *
 * @author ACER
 *NAMA              : Nurul Khafidoh
 *KELAS             : PBO RegPagi
 *NIM               : 22166012
 *DESKRIPSI PROGRAM : Program ini berisi program untuk
 * menghitung target saldo tabungan
 */

import java.text.DecimalFormat;

public class SIRegPagi22166012Latihan20Target {
    
    public static void main(String[] args) { 
        
        System.out.println("===== Tampilan target saldo tabungan =====");
        //Masukkan variabel
        double saldoAwal = 3500000;
        double bungaPerbulan = 8.0;
        double saldoTarget = 6000000;
        
        //Format yang digunakan
        DecimalFormat df = new DecimalFormat ("#,###,###");
        String saldoAwalFormatted = df.format(saldoAwal);
        
        //perintah while yang digunakan untuk mengulang statement
        int bulan = 0;
        while (saldoAwal < saldoTarget) {
        double bunga = saldoAwal * (bungaPerbulan/100);
        saldoAwal += bunga;
        bulan++;
            
        //Untuk menampilkan hasil akhir
        String saldoBulanFormatted = df.format(saldoAwal);
        System.out.println("Saldo di bulan ke-" + bulan + " Rp " + saldoBulanFormatted);
        
       
        
        
    }
    }   
}
