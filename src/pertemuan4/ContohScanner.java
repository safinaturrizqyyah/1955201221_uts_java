/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ContohScanner {
//    public static void main(String[] args) {
//        int usia = 0;
//        
//        // membuat scanner
//        System.out.println("Umur Anda Berapa?");
//        Scanner inputUser = new Scanner(System.in);
//        usia = Integer.parseInt (inputUser.nextLine());
//        
//        //output
//        System.out.println("Usia Anda adalah " + usia);


         // UTS Scanner1
         
//         String nama = "";
//         int nim = 0;
//         String alamat = "";
//         String prodi = "";
//         double ipk = 0.0;
//         
//         // Membuat scanner
//         System.out.println("Siapa Anda?");
//         Scanner keyboard = new Scanner(System.in);
//         nama = keyboard.next();
//         
//         System.out.println("Berapa NIM Anda?");
//         Scanner inputUser = new Scanner(System.in);
//         nim = Integer.parseInt (inputUser.nextLine());
//         
//         System.out.println("Dimana Alamat Anda?");
//         alamat = keyboard.next();
//         
//         System.out.println("Prodi Apa Yang Anda Ambil?");
//         prodi = keyboard.next();
//         
//         System.out.println("Berapa Ipk Anda pada Semester ini?");
//         ipk = keyboard.nextDouble();
//         
//         //output
//         System.out.println("Nama: " + nama);
//         System.out.println("NIM: " + nim);
//         System.out.println("Alamat: " + alamat);
//         System.out.println("Prodi: " + prodi);
//         System.out.println("Ipk: " + ipk);            
//    }
    
//    UTS Percobaan 2
    
//    public static void main(String[] args) {
//        String nama, prodi;
//        int nim, usia;
//        double ipk;
//        
//        //New Scanner
//        Scanner keyboard = new Scanner(System.in);
//        Scanner inputUser = new Scanner(System.in);
//        
//        //Output to user
//        System.out.println("_Data Diri Mahasiswa_");
//        System.out.println("Siapa Anda?");
//        nama = keyboard.next();
//         
//        System.out.println("Prodi Apa Yang Anda Ambil?");
//        prodi = keyboard.next();
//         
//        System.out.println("Berapa NIM Anda?");
//        nim = Integer.parseInt (inputUser.nextLine());
//        
//        System.out.println("Berapa Usia Anda?");
//        usia = Integer.parseInt (inputUser.nextLine());
//         
//        System.out.println("Berapa Ipk Anda pada Semester ini?");
//        ipk = keyboard.nextDouble();
//         
//        //output
//        System.out.println("_Data Diri Mahasiswa_");
//        System.out.println("Nama: " + nama);
//        System.out.println("Prodi: " + prodi);
//        System.out.println("NIM: " + nim);
//        System.out.println("Usia: " + usia);
//        System.out.println("Ipk: " + ipk);
//        System.out.println("_Terima kasih_");
//    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("       MINI MARKET       ");
        System.out.println("=========================");
        
        System.out.println("Masukkan jumlah produk yang anda beli");
        int beli = input.nextInt();
        
        for (int i = 1; i<= beli; i++)
        {
            System.out.println("Masukkan nama barang ke- " + i);
            String nama = input.next();
            System.out.println("Harga barang satuan");
            int harga = input.nextInt();
            System.out.println("Jumlah barang");
            int jumlah_B = input.nextInt();
            
            
            System.out.println("===============================");
            System.out.println("Nama barang   : " + nama);
            System.out.println("Harga barang  : " + harga);
            System.out.println("Jumlah barang : " + jumlah_B);
            System.out.println("===============================");
            
            int total, total_B, diskon = 0;
            total = harga * jumlah_B;
            System.out.println("Total belanja = Rp." + total);
            if (total >= 200000) {
                diskon = total/100;
                
            } else {diskon = 0;}
            
            System.out.println("Diskon = Rp." + diskon);
            total_B = total - diskon;
            System.out.println("Total bayar = Rp." + total_B);
            
            System.out.println("Uang Bayar = Rp.");
            int bayar = input.nextInt();
            
            int kembali = bayar - total_B;
            System.out.println("Uang Kembali = Rp." + kembali);
            System.out.println("==================================================");
            System.out.println("Terima kasih telah berbelanja di toko kami *^_^*");
            System.out.println("==================================================");
            System.out.println("");
            
        }
    }
    
}
