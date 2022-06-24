public class mataKuliah {
    String kode, namaMk;
    int sks;

    public mataKuliah(String kode, String namaMk, int sks) {
        this.kode = kode;
        this.namaMk = namaMk;
        this.sks = sks;
    }

    public String toString() {
        return String.format("%s\t%-45s%s", kode, namaMk, sks);
    }
}