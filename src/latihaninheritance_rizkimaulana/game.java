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
public class game extends software{
    
    //deklarasi variabel
    
    private String jenis="unknown";
    private String tipe="unknown";
    
    //constructor
    
    game (String kode,String nama,String lisensi)
    {
        super(kode,nama,lisensi);
    }
    game (String kode,String nama,String lisensi,String jenis,String tipe)
    {
        super.setKode(kode);
        super.setNama(nama);
        super.setLisensi(lisensi);
        
        this.jenis=jenis;
        this.tipe=tipe;
    }
    //getter
    public String getKode()
    {
        return super.getKode();
    }
    public String getNama()
    {
        return super.getNama();
    }
    public String getLisensi()
    {
        return super.getLisensi();     
    }
    public String getJenis()
    {
        return jenis;
    }
    public String getTipe()
    {
        return tipe;
    }
}
