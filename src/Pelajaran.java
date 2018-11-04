/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author YESSYNP
 */
public class Pelajaran {
          private String nama;
    private int biaya;
    private Murid murid;
    private Pengajar pengajar;
    
    Pelajaran(){
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setMurid(Murid murid){
        this.murid = murid;
    }
    public void setPengajar (Pengajar pengajar){
        this.pengajar=pengajar;
    }
    public void setBiaya(int biaya){
        this.biaya = biaya;
    }
    public String getNama(){
        return nama;
    }
    public Murid getMurid(){
        return murid;
    }
    public Pengajar getPengajar(){
        return pengajar;
    }
    public int getBiaya(){
        return biaya;
    }
    public int HitungBiayaPelajaran(int pelajaran){
        return biaya*pelajaran;
    }
}