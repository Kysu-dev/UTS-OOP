/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SC1n2;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args){
        
        Ayah ayah = new Ayah (1, "Ogah Surogah");
        
        Perusahan perusahaan = new Perusahan(1, "Cermelang Jaya");
        
        Karyawan karyawan1 = new Karyawan (1,"Unyil Surinyil");
        karyawan1.setAyah(ayah);
        karyawan1.setPerusahaaan(perusahaan);
        
        System.out.println(karyawan1.getNama() + " Adalah anak " + karyawan1.getAyah().getNama());
        System.out.println(karyawan1.getNama() + " Bekerja Di Pt " + karyawan1.getPerusahaan().getNama());
    
    }
    
}
