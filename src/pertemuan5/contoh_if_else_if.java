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
public class contoh_if_else_if {
//    public static void main(String[] args) {
//        
//        String nama = JOptionPane.showInputDialog(null, "Siapa Nama Anda?");
//        int nilai = Integer.parseInt(JOptionPane.showInputDialog(null, "Berapa Nilai Anda?"));
//        
//        if(nilai >= 91) {
//            JOptionPane.showMessageDialog(null, "Selamat " + nama + ", Nilai A!");
//            
//        }else if(nilai >= 86){
//            JOptionPane.showMessageDialog(null, "Selamat " + nama + ", Nilai A-!");
//            
//        }else if (nilai <= 50){
//            JOptionPane.showMessageDialog(null, "Ya Allah " + nama + ", Nilai E!");
//            
//        }
//    }
    
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog(null, "Siapa Nama Kamu?");
        String sekolah = JOptionPane.showInputDialog(null, "Asal Sekolah?");
        String kelas = JOptionPane.showInputDialog(null, "Kamu kelas berapa?");
        int nilai = Integer.parseInt(JOptionPane.showInputDialog(null, "Berapa Nilai Anda?"));
        
        if (nilai>90){
            JOptionPane.showMessageDialog(null, "Selamat " + nama + ", Kamu anak yang cerdas");
        }
        else if (nilai>70 && nilai<90){
            JOptionPane.showMessageDialog(null, "Maaf " + nama + ". Nilai kamu cukup, "
                    + "Kamu mesti memperbaikinya.");
    }
        else{
            JOptionPane.showMessageDialog(null, "Maaf sekali " + nama + ". Nilai kamu jelek, "
                    + "Kamu mesti rajin belajar lagi.");
        }
}
}