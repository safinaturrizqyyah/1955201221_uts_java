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
public class contoh_if_else {
//    public static void main(String[] args) {
//        
//        String nama = JOptionPane.showInputDialog(null, "Siapa Nama Anda?");
//        int nilai = Integer.parseInt(JOptionPane.showInputDialog(null, "Berapa Nilai Anda?"));
//        
//        if(nilai >= 75) {
//            JOptionPane.showMessageDialog(null, "Selamat " + nama + ", Anda lulus!");
//            
//        }else{
//            JOptionPane.showMessageDialog(null, "Piye toh " + nama + ", Anda gagal!");
//        }

    
//    UTS Percobaan 1
//    public static void main(String[] args) {
//        
//       String nama = JOptionPane.showInputDialog(null, "Siapa Nama pembeli?");
//       String alamat = JOptionPane.showInputDialog(null, "Pembeli berasal Darimana?");
//       String nama_barang = JOptionPane.showInputDialog(null, "Produk apa saja yang akan diambil?");
//       int total_belanja = Integer.parseInt(JOptionPane.showInputDialog(null, "Berapa Total Belanja Pembeli?"));
//       
//       if (total_belanja >= 100000) {
//           JOptionPane.showMessageDialog(null, "Selamat " + nama + ", Anda mendapatkan Diskon");
//           
//       }else {
//           JOptionPane.showMessageDialog(null, "Maaf " + nama + ", Anda tidak mendapatkan Diskon!");
//           
//           }        
//}
    
//    UTS Percobaan 2
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog(null, "Siapa Nama Anda?");
        String asal = JOptionPane.showInputDialog(null, "Berasal darimana Anda?");
        String lulus = JOptionPane.showInputDialog(null, "Lulusan tahun berapa Anda??");
        String status = JOptionPane.showInputDialog(null, "Apa status anda?");
        double tinggi = Double.parseDouble(JOptionPane.showInputDialog("Berapa Tinggi Badan Anda?"));
        int umur = Integer.parseInt(JOptionPane.showInputDialog(null, "Berapa umur Anda?"));
        
        if(umur >= 20) {
            JOptionPane.showMessageDialog(null, "Selamat " + nama + ", Anda bisa bergabung dengan usaha kami.");
            
        }else{
            JOptionPane.showMessageDialog(null, "Maaf " + nama + ", Anda belum mencukupi batas usia minimum pekerja.");
        }
        
    }
    
}
       
    
    

