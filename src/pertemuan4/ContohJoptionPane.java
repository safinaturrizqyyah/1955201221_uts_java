/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class ContohJoptionPane { 
    public static void main(String[] args) {
        String nama;
        String letak;
        String agama;
        String pekerjaan;
        String status;
        int umur;
        int tinggi_badan;
        double berat_badan;
      
        // mengisi variabel nama dengan JoptionPane
        nama = JOptionPane.showInputDialog("Siapa Nama Anda?");
        letak = JOptionPane.showInputDialog("Dimana Anda Berada?");
        agama = JOptionPane.showInputDialog("Apa Agama Anda?");
        pekerjaan = JOptionPane.showInputDialog("Dimana Anda Bekerja?");
        status = JOptionPane.showInputDialog("Apa Status Anda?");
        umur = Integer.parseInt(JOptionPane.showInputDialog("Berapa Umur Anda?"));
        tinggi_badan = Integer.parseInt(JOptionPane.showInputDialog("Tinggi Badan Anda Berapa?"));
        berat_badan = Double.parseDouble(JOptionPane.showInputDialog("Berapa Berat Badan Anda?"));
        
        // menampilkan input
        JOptionPane.showMessageDialog(null, "Hai " + nama);
        JOptionPane.showMessageDialog(null, "Anda Sekarang Berada di " + letak);
        JOptionPane.showMessageDialog(null, "Agama Anda Adalah " + agama);
        JOptionPane.showMessageDialog(null, "Anda bekerja di " + pekerjaan);
        JOptionPane.showMessageDialog(null, "Status Anda " + status);
        JOptionPane.showMessageDialog(null, "Anda Berumur " + umur);
        JOptionPane.showMessageDialog(null, "Tinggi Badan Anda " + tinggi_badan);
        JOptionPane.showMessageDialog(null, "Dan Berat Badan Anda adalah " + berat_badan);
        
        
      
        
        
        
    }
    
}
