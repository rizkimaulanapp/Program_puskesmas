/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihaninheritance_rizkimaulana;

/**
 *
 * @author Kiki
 */
public class software 
{
    //deklarasi variabel
    private String kode,nama,lisensi;
    //constructor
    software()
    {
    }
    software ( String kode, String nama, String lisensi){
        this.kode=kode;
        this.nama=nama;
        this.lisensi=lisensi;
    }
    //setter
    public void setKode(String k){
        kode=k;
    }
    public void setNama (String n){
        nama=n;
    }
    public void setLisensi (String l){
        lisensi=l;
    }
    
    //getter
    public String getKode()
    {
        return kode;
        
    }
    public String getNama()
    {
        return nama;
    }
    public String getLisensi()
    {
        return lisensi;
    }
}
