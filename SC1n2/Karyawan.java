/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SC1n2;

/**
 *
 * @author DELL
 */
public class Karyawan extends Penduduk{
    private Perusahan perusahaan;
    private Ayah ayah;
    public Karyawan(int NIK, String nama) {
        super(NIK, nama);
    }

    public Perusahan getPerusahaan() {
        return perusahaan;
    }

    public void setPerusahaaan(Perusahan perusahaan) {
        this.perusahaan = perusahaan;
    }
    

    public Ayah getAyah() {
        return ayah;
    }

    public void setAyah(Ayah ayah) {
        this.ayah = ayah;
    }
    
}
