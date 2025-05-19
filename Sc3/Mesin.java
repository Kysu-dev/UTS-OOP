package Sc3;

public class Mesin {

    private String id;
    private String merek;
    private String Ukuran;

    public Mesin(String id, String merek, String ukuran) {
        this.id = id;
        this.merek = merek;
        Ukuran = ukuran;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getUkuran() {
        return Ukuran;
    }

    public void setUkuran(String ukuran) {
        Ukuran = ukuran;
    }


}
