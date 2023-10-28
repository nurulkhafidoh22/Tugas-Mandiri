import java.util.Scanner;
/**
 *
 * @author ACER
 *NAMA              : Nurul Khafidoh
 *KELAS             : PBO RegPagi
 *NIM               : 22166012
 *DESKRIPSI PROGRAM : Program ini berisi program untuk menampilkan
 * tanya jawab tugas
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

public class SIRegPagi22166012Latihan30Cakep {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("===== Tampilan pertanyaan =====");
        // tampilan pertanyaan
        System.out.print("\u001B[33mKamu\u001B[0m \u001B[34mngerjain\u001B[0m \u001B[35msendiri\u001B[0m "
                + "\u001B[36mlatihan\u001B[0m \u001B[32m17\u001B[0m \u001B[38msampe\u001B[0m \u001B[31mlatihan \u001B[0m"
                + "\u001B[32m 30\u001B[0m \u001B[35ini?\u001B[0m");
        String tanya = input.nextLine();
       
        // Menginputkan Jawaban mahasiswa 
        System.out.print("\u001B[35mJawab\u001B[0m \u001B[34m(Yoi/Enggak) :  \u001B[0m");
        String jawab = input.nextLine();
        
        if (jawab.equalsIgnoreCase("Yoi")) {
            jawab = "\u001B[31mCakep \u001B[0m \u001B[32mBener."
                        + "\u001B[0m \u001B[33mGood"
                        + "\u001B[0m \u001B[34mJob";
        } else if (jawab.equalsIgnoreCase("Enggak")) {
            jawab = " \u001B[31mTetep\u001B[0m \u001B[32mCakep"
                        + "\u001B[0m \u001B[33msih.\n"
                        + "\u001B[0m \u001B[34mSing penting paham konsep nya yee\n \u001B[0m\u001B[35mKeep the code works dude.";
        } else {
            jawab = "Jawaban tidak valid.";
        }
        System.out.println(jawab);
    }  
}
