/**
 *
 * @author ACER
 *NAMA              : Nurul Khafidoh
 *KELAS             : PBO RegPagi
 *NIM               : 22166012
 *DESKRIPSI PROGRAM : Program ini berisi program untuk
 * mengganti kata
 */

import java.util.Scanner;

public class SIRegPagi22166012Latihan28GantiKata {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("===== Program Mengganti Kata =====");
        
        //Memasukkan kalimat
        System.out.print("Masukkan Kalimat: ");
        String kalimat = input.nextLine();
        
        //Memasukkan kata yang akan diganti
        System.out.print("Ganti kata: ");
        String GantiKata = input.next();
        
        //Menampilkan kata ganti
        System.out.print("Menjadi kata: ");
        String  MenjadiKata = input.next();
        
        //Input variabel
        String KalimatBaru = kalimat.replace(GantiKata, MenjadiKata);
        
        //Output berupa kalimat awal dan kalimat akhir
        System.out.println("Kalimat awal: "+kalimat);
        System.out.println("Kalimat baru: "+KalimatBaru);
    }
    
}