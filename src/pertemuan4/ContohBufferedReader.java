/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStreamReader;
import jdk.nashorn.internal.runtime.ScriptingFunctions;

/**
 *
 * @author LENOVO
 */
public class ContohBufferedReader {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
//    public static void main(String[] args) throws IOException {
//        // TODO code application logic here
//        String nama = "";
//        String status = "";
//        // object inputStream
//        InputStreamReader isr = new InputStreamReader (System.in);
//        // object BufferedReader
//        BufferedReader br = new BufferedReader(isr);
//        
//        // mengisi variabel nama dengan BufferedReader
//        System.out.println("Siapa Nama Anda?");
//        nama = br.readLine();
//        
//        System.out.println("Jomblo Opo Ora, Kowe?");
//        status = br.readLine();
//        // menampilkan nama
//        System.out.println("Nama Anda Adalah " + nama);
//        System.out.println("Anda Ternyata " + status);
//        
        
        // Tugas UTS BufferedReader
    
    public static void main(String[] args) throws IOException {
        String nama = "";
        String alamat_asal = "";
        String pekerjaan = "";
        String asal_kampus = "";
        String prodi = "";
       
        
        
        // object inputStream
        InputStreamReader isr = new InputStreamReader (System.in);
       
        // object BufferedReader
        BufferedReader br = new BufferedReader(isr);
        
        // mengisi variabel nama dengan BufferedReader
        System.out.println("Siapa Nama Anda?");
        nama = br.readLine();
        
        System.out.println("Dimana Asal Alamat Anda?");
        alamat_asal = br.readLine();
        
        System.out.println("Apa Pekerjaan Anda?");
        pekerjaan = br.readLine();
        
        System.out.println("Dimana Letak Kampus Anda?");
        asal_kampus = br.readLine();
        
        System.out.println("Apa Prodi Yang Anda Ambil?");
        prodi = br.readLine();
        
        
        // menampilkan nama
        System.out.println("Nama Anda adalah " + nama);
        System.out.println("Alamat Anda di " + alamat_asal);
        System.out.println("Pekerjaan Anda adalah " + pekerjaan);
        System.out.println("Kampus Anda Berada di " + asal_kampus);
        System.out.println("Prodi Yang Anda Ambil adalah " + prodi);
        
    }
    
    }
    

