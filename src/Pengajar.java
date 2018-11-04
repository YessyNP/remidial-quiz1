

/**
 *
 * @author YESSYNP
 */
public class Pengajar {
    private String nama;
    private String level;
    private int biaya;
    
    Pengajar(String nama, String level){
        this.nama = nama;
        this.level = level;
    }
    Pengajar(){
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setLevel(String level){
        this.level = level;
    }
    public void setBiaya(int biaya){
        this.biaya = biaya;
    }
    public String getNama(){
        return nama;
    }
    public String getLevel(){
        return level;
    }
    public int getBiaya(){
        return biaya;
    }
    public int HitungGajiPengajar(int bulan){
        return biaya*bulan;
    }   
}