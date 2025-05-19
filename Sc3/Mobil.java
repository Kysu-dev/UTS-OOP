package Sc3;

public class Mobil {

    private String id;
    private String merek;
    private final Mesin mesin;

    public Mobil(String id, String merek, String mesinId, String mesinMerek, String mesinUkuran) {
        this.id = id;
        this.merek = merek;
        this.mesin = new Mesin(mesinId, mesinMerek, mesinUkuran);
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

    public Mesin getMesin() {
        return mesin;
    }
}
