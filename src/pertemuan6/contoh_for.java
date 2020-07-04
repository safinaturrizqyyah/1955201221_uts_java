/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author LENOVO
 */
public class contoh_for {
//    public static void main(String[] args) {
//        //"for" lalu tekan Tombol Tab
//        
//        int i;
//        for (i = 1; i <= 10; i++){
//        System.out.println("Hellooooo " + i);
//    }
//    }
    public static void main(String[] args) {
        int n = 5;
        String rice_cooker = "";
        
        System.out.println("Mulai");
        System.out.println("Siapkan beras secukupnya");
        System.out.println("Cuci beras terlebih dahulu");
        System.out.println("Masukkan beras kedalam rice_cooker");
        System.out.println("Hubungkan rice_cooker pada stopkontak");
        System.out.println("Tekan tombol cook pada rice_cooker");
        
        
        for (int i = 1; i < n; i++){
            System.out.println("Tekan tombol cook pada rice_cooker lagi- " + i);
        }
        
    }
    
}
