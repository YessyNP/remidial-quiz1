/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author YESSYNP
 */
public class Biaya {
       private String nama;
    private Pengajar pengajar;
    private Pelajaran pelajaran;
    private Murid murid;
    private int bulan;
    
  public Biaya(){
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
    public void setPelajaran(Pelajaran pelajaran){
        this.pelajaran = pelajaran;
    }
    public void setBulan(int bulan){
        this.bulan=bulan;
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
    public Pelajaran getPelajaran(){
        return pelajaran;
    }
    public int bulan(){
        return bulan;
    }
    public int HitungTotal(){
        return pengajar.HitungGajiPengajar(bulan) + pelajaran.HitungBiayaPelajaran(bulan);
    }
}