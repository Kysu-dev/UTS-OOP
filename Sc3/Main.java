package Sc3;

public class Main {
    public static void main(String[] args) {

        Himpunan himpunan =  new Himpunan("001", "Himpunan Mahasiswa Informatika Itenas");

        Prodi prodi = new Prodi("001", "Informatika");

        Mobil mobil = new Mobil("001", "Honda", "001", null, "1500cc");

        Mahasiswa mhs1 = new Mahasiswa("001", "Unyil Surunyil", prodi, himpunan);
        mhs1.setMobil(mobil);

        Mahasiswa mhs2 = new Mahasiswa("002", "Usro Suroso", prodi, himpunan);

        System.out.println("Nama Mahasiswa 1: " + mhs1.getNama());
        System.out.println("Nama Mahasiswa 2: " + mhs2.getNama());
        System.out.println( mhs1.getNama() + " dan " + mhs2.getNama() + " Kuliah di " + mhs1.getProdi().getNama() + " Itenas Bandung");
        System.out.println("Mereka Anggota " + mhs1.getHimpunan().getNama());
        System.out.println(mhs1.getNama() + " Mengendarai Mobil " + mhs1.getMobil().getMerek() + " dengan mesin " + mhs1.getMobil().getMesin().getUkuran());
    }

}
