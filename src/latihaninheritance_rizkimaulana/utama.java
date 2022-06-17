/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihaninheritance_rizkimaulana;
import java.io.*;
/**
 *
 * @author Kiki
 */
public class utama {
    public static void main (String []args)throws Exception
    {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        //instance of class
        game gameA=new game ("","","");
        game gameB=new game ("","","","","");
        game gameC=new game ("","","");
        game gameD=new game ("","","","","");
        //menu
        while (true)
                {
                    //menu
                    System.out.println("====================");
                    System.out.println("MENU GAME");
                    System.out.println("====================");
                    System.out.println("1. Input Game A");
                    System.out.println("2. Input Game B");
                    System.out.println("3. Input Game C");
                    System.out.println("4. Input Game D");
                    System.out.println("5. Lihat data Game");
                    System.out.println("6. Keluar");
                    System.out.println("=====================");
                    
                    //input
                    System.out.println("masukan Pilihan = ");
                    int pilih =Integer.parseInt(br.readLine());
                    System.out.println();
                    
                    //proses + output
                    switch (pilih)
                    {
                        //jika pilih = 1
                        case 1:
                            //isi pilihan bernilai 1 ketika dijalankan
                            System.out.println("====================");
                            System.out.println("INPUT GAME A");
                            System.out.println("====================");
                            System.out.println("Masukan kode = ");
                            String kode = br.readLine();
                            System.out.println("Masukan nama = ");
                            String nama =br.readLine();
                            System.out.println("Masukan lisensi = ");
                            String lisensi=br.readLine();
                            
                            gameA = new game(kode,nama,lisensi);
                            
                            System.out.println();
                            System.out.println("### Data Game A telah Tersimpan ###");
                            break;
                            
                        //jika pilih = 2
                        case 2:
                            //isi pilihan bernilai 2 ketika dijalankan
                            System.out.println("======================");
                            System.out.println("INPUT GAME B");
                            System.out.println("======================");
                            System.out.println("Masukan kode = ");
                            kode= br.readLine();
                            System.out.println("Masukan nama = ");
                            nama=br.readLine();
                            System.out.println("Masukan lisensi = ");
                            lisensi=br.readLine();
                            System.out.println("Masukan jenis = ");
                            String jenis=br.readLine();
                            System.out.println("Masukan tipe = ");
                            String tipe = br.readLine();
                            
                            gameB = new game (kode,nama,lisensi,jenis,tipe);
                            
                            System.out.println();
                            System.out.println("### Data Game B telah disimpan ###");
                            break;
                            
                        //jika pilih = 3   
                        case 3:
                            //isi pilihan bernilai 3 ketika dijalankan
                            System.out.println("====================");
                            System.out.println("INPUT GAME C");
                            System.out.println("====================");
                            System.out.println("Masukan kode = ");
                            String Kode = br.readLine();
                            System.out.println("Masukan nama = ");
                            String Nama =br.readLine();
                            System.out.println("Masukan lisensi = ");
                            String Lisensi=br.readLine();
                            
                            gameC = new game(Kode,Nama,Lisensi);
                            
                            System.out.println();
                            System.out.println("### Data Game C telah Tersimpan ###");
                            break;
                            
                        //jika pilih = 4   
                        case 4:
                            //isi pilihan bernilai 4 ketika dijalankan
                            System.out.println("======================");
                            System.out.println("INPUT GAME D");
                            System.out.println("======================");
                            System.out.println("Masukan kode = ");
                            Kode= br.readLine();
                            System.out.println("Masukan nama = ");
                            Nama=br.readLine();
                            System.out.println("Masukan lisensi = ");
                            Lisensi=br.readLine();
                            System.out.println("Masukan jenis = ");
                            String Jenis=br.readLine();
                            System.out.println("Masukan tipe = ");
                            String Tipe = br.readLine();
                            
                            gameD = new game (Kode,Nama,Lisensi,Jenis,Tipe);
                            
                            System.out.println();
                            System.out.println("### Data Game D telah disimpan ###");
                            break;
                            
                            
                        //jika pilih 5
                        case 5:
                            //isi pilihan bernilai 5 ketika dijalankan
                            System.out.println("========================");
                            System.out.println(" DATA GAME ");
                            System.out.println("========================");
                            
                            System.out.println(" Game A");
                            System.out.println(" Kode Game A = "+gameA.getKode());
                            System.out.println(" Nama Game A = "+gameA.getNama());
                            System.out.println(" Lisensi Game A = "+gameA.getLisensi());
                            System.out.println(" Jenis Game A = "+gameA.getJenis());
                            System.out.println(" Tipe Game A = "+gameA.getTipe());
                            System.out.println();
                            System.out.println(" Game B");
                            System.out.println(" Kode Game B = "+gameB.getKode());
                            System.out.println(" Nama Game B = "+gameB.getNama());
                            System.out.println(" Lisensi Game B = "+gameB.getLisensi());
                            System.out.println(" Jenis Game B = "+gameB.getJenis());
                            System.out.println(" Tipe Game B = "+gameB.getTipe());
                            System.out.println();
                            System.out.println(" Game C");
                            System.out.println(" Kode Game C = "+gameC.getKode());
                            System.out.println(" Nama Game C = "+gameC.getNama());
                            System.out.println(" Lisensi Game C = "+gameC.getLisensi());
                            System.out.println(" Jenis Game C = "+gameC.getJenis());
                            System.out.println(" Tipe Game C = "+gameC.getTipe());
                            System.out.println();
                            System.out.println(" Game D");
                            System.out.println(" Kode Game D = "+gameD.getKode());
                            System.out.println(" Nama Game D = "+gameD.getNama());
                            System.out.println(" Lisensi Game D = "+gameD.getLisensi());
                            System.out.println(" Jenis Game D = "+gameD.getJenis());
                            System.out.println(" Tipe Game D = "+gameD.getTipe());
                            System.out.println();
                            
                            System.out.println("========================");
                            break;
                    }
                }
       
    }
}
