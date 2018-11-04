/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author YESSYNP
 */
public class Main {
    public static void main(String[] args){
        Pelajaran p = new Pelajaran();
        p.setNama("PBO");
        p.setBiaya(50000);
        Pengajar pe = new Pengajar();
        pe.setNama("Yessy Nindi Pratiwi");
        pe.setLevel("high");
        pe.setBiaya(500000);
        Murid m = new Murid();
        m.setNama("Luthfiya Nur Azizah");
        m.setKelas("TI-2B");
        Biaya b = new Biaya();
        b.setNama("Primagama");
        b.setPengajar(pe);
        b.setPelajaran(p);
        b.setMurid(m);
        b.setBulan(3);
        System.out.println("Welcome to "+b.getNama());
        System.out.println("Nama Tutor : "+pe.getNama());
        System.out.println("Nama Siswa : "+m.getNama());
        System.out.println("Kelas : "+m.getKelas());
        System.out.println("Pelajaran yang diikuti : "+p.getNama());
        System.out.println("Biaya Pembayaran : "+b.HitungTotal());
    }
}