

/**
 *
 * @author YESSYNP
 */
public class Murid {
     private String nama;
    private String kelas;
    private Pengajar pengajar;
    
    Murid(){
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    public void setPengajar(Pengajar pengajar){
        this.pengajar = pengajar;
    }
    public String getNama(){
        return nama;
    }
    public String getKelas(){
        return kelas;
    }
    public Pengajar getPengajar(){
        return pengajar;
}
}
