import java.util.Scanner;
/**
 *
 * @author ACER
 *NAMA              : Nurul Khafidoh
 *KELAS             : PBO RegPagi
 *NIM               : 22166012
 *DESKRIPSI PROGRAM : Program ini berisi program untuk menampilkan 
 *jenis tipe data bilangan bulat
 */
public class SIRegPagi22166012Latihan17Tunjangan {
    
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
  
        //untuk menampilkan judul
        System.out.println("========Program Tunjangan========");
        
        //Masukkan jumlah gaji pokok
        System.out.println("Berapa gaji pokok anda perbulan? : Rp. ");
        double gajipokok = input.nextDouble();
        System.out.println("Gaji pokok   :  "+gajipokok);
        
        //Masukkan status anda
        System.out.println("Status anda(Menikah/Belum?) : ");
        String status = "Menikah";
        System.out.println("Status anda :"+status);
        
        //untuk menampilkan judul hasil perhitungan
        System.out.println("========Hasil Perhitungan========");
       
        //output
        System.out.println("Gaji pokok : "+gajipokok);
        double tunjangan =(status == "Menikah" )? 0.35*gajipokok:0;
        System.out.println("Tunjangan   :  " + tunjangan);
      
        //Menampilkan jumlah gaji
        double totalgaji = gajipokok+tunjangan;
        System.out.println("Total Gaji   :  "+totalgaji);
        
    }
   
}
