/**
 *
 * @author ACER
 *NAMA              : Nurul Khafidoh
 *KELAS             : PBO RegPagi
 *NIM               : 22166012
 *DESKRIPSI PROGRAM : Program ini berisi program untuk
 * waktu saat ini
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class SIRegPagi22166012Latihan26Waktu {

    public static void main(String[] args) {
        
        System.out.println("===== Tampilan waktu saat ini =====");
        //Perintah untuk menampilkan tanggal dan waktu saat ini
        LocalDateTime waktuSaatIni = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm:ss", new Locale("id", "ID"));
        String formattedWaktu = waktuSaatIni.format(formatter);
        
        //Output program waktu
        System.out.println("Hari ini adalah hari: " + formattedWaktu);
    }
    
}