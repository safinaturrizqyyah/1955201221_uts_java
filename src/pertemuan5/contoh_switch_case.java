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
public class contoh_switch_case {
    
//    public static void main(String[] args) {
//         String nama = JOptionPane.showInputDialog(null, "Siapa Nama Anda?");
//         String nilai = JOptionPane.showInputDialog(null, "Berapa Nilai Anda?");
//        
//        switch(nilai){
//            case "A":
//                JOptionPane.showMessageDialog(null, "Selamat " + nama + ", Nilai A");
//                break;
//            case "B":
//                JOptionPane.showMessageDialog(null, "Selamat " + nama + ", Nilai B");
//                break;
//            case "E":
//                JOptionPane.showMessageDialog(null, "Selamat " + nama + ", Nilai E");
//                break;
//            default: JOptionPane.showMessageDialog(null, "Nilai yang Anda Masukkan Salah");
//        }
//    }
    
    public static void main(String[] args) {
        
        int bulan = 1;
        int tahun = 2020;
        int jumlah_hari = 0;
        
        switch (bulan) {
            case 1:
                System.out.println("*==================================*");
                System.out.println("#   Kalender Hijriyah Tahun 2020   #");
                System.out.println("#         _Bulan Januari_          #");
                System.out.println("*==================================*");
                jumlah_hari = 31;
                break;
            case 3:
                System.out.println("*==================================*");
                System.out.println("#   Kalender Hijriyah Tahun 2020   #");
                System.out.println("#          _Bulan Maret_           #");
                System.out.println("*==================================*");
                jumlah_hari = 31;
                break;
            case 5:
                System.out.println("*==================================*");
                System.out.println("#   Kalender Hijriyah Tahun 2020   #");
                System.out.println("#           _Bulan Mei_            #");
                System.out.println("*==================================*");            
                jumlah_hari = 31;
                break;
            case 7:
                System.out.println("*==================================*");
                System.out.println("#   Kalender Hijriyah Tahun 2020   #");
                System.out.println("#           _Bulan Juli_           #");
                System.out.println("*==================================*");   
                jumlah_hari = 31;
                break;
            case 8:
                System.out.println("*==================================*");
                System.out.println("#   Kalender Hijriyah Tahun 2020   #");
                System.out.println("#         _Bulan Agustus_          #");
                System.out.println("*==================================*");
                jumlah_hari = 31;
                break;
            case 10:
                System.out.println("*==================================*");
                System.out.println("#   Kalender Hijriyah Tahun 2020   #");
                System.out.println("#         _Bulan Oktober_          #");
                System.out.println("*==================================*");
                jumlah_hari = 31;
                break;
            case 12:
                System.out.println("*==================================*");
                System.out.println("#   Kalender Hijriyah Tahun 2020   #");
                System.out.println("#         _Bulan Desember_         #");
                System.out.println("*==================================*");
                jumlah_hari = 31;
                break;
                
            case 4:
                System.out.println("*==================================*");
                System.out.println("#   Kalender Hijriyah Tahun 2020   #");
                System.out.println("#          _Bulan April_           #");
                System.out.println("*==================================*");
                jumlah_hari = 30;
                break;
            case 6:
                System.out.println("*==================================*");
                System.out.println("#   Kalender Hijriyah Tahun 2020   #");
                System.out.println("#           _Bulan Juni_           #");
                System.out.println("*==================================*");
                jumlah_hari = 30;
                break;
            case 9:
                System.out.println("*==================================*");
                System.out.println("#   Kalender Hijriyah Tahun 2020   #");
                System.out.println("#        _Bulan September_         #");
                System.out.println("*==================================*");
                jumlah_hari = 30;
                break;
            case 11:
                System.out.println("*==================================*");
                System.out.println("#   Kalender Hijriyah Tahun 2020   #");
                System.out.println("#         _Bulan November_         #");
                System.out.println("*==================================*");
                jumlah_hari = 30;
                break;
                
            case 2:
                System.out.println("*==================================*");
                System.out.println("#   Kalender Hijriyah Tahun 2020   #");
                System.out.println("#         _Bulan Februari_         #");
                System.out.println("*==================================*");
                jumlah_hari = 29;
                break;
                
            default: 
                System.out.println("Mohon Maaf Bulan Hanya Sampai 12 saja " + "*^_^*");
                break;
        }
        
        System.out.println("Jumlah hari = " + jumlah_hari);
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
