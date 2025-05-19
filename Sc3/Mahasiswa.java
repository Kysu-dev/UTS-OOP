package Sc3;

public class Mahasiswa {

    private String id;
    private String nama;
    private Prodi prodi;
    private Himpunan himpunan;
    private Mobil mobil;

    public Mahasiswa(String id, String nama, Prodi prodi, Himpunan himpunan) {
        this.id = id;
        this.nama = nama;
        this.prodi = prodi;
        this.himpunan = himpunan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Prodi getProdi() {
        return prodi;
    }

    public void setProdi(Prodi prodi) {
        this.prodi = prodi;
    }

    public Himpunan getHimpunan() {
        return himpunan;
    }

    public void setHimpunan(Himpunan himpunan) {
        this.himpunan = himpunan;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }
}
