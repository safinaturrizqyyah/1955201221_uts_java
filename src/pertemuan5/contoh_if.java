/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class contoh_if {
//    public static void main(String[] args) {
//        
//        int belanja = 1000000;
//        
//        if(belanja > 100000){
//            System.out.println("Anda Mendapatkan Hadiah");
//        }
//        
//        System.out.println("Terima kasih telah berbelanja di toko kami");
        
//        int belanja = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Total Belanja Anda"));
//        
//        if(belanja > 100000){
//            System.out.println("Anda Mendapatkan Hadiah");
//            JOptionPane.showMessageDialog(null, "Anda Mendapatkan Hadiah");
//        }
//        JOptionPane.showMessageDialog(null, "Terima kasih telah berbelanja di toko kami");
        
//    }
    
    //Tugas
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog(null, "Siapa Nama Kamu?");
        String sekolah = JOptionPane.showInputDialog(null, "Asal Sekolah?");
        String kelas = JOptionPane.showInputDialog(null, "Kamu kelas berapa?");
        int nilai = Integer.parseInt(JOptionPane.showInputDialog(null, "Berapa Nilai Anda?"));
        
        if (nilai>90){
            JOptionPane.showMessageDialog(null, "Selamat " + nama + ", Kamu anak yang cerdas");
        }   
    }
}

