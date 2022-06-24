public class film {
    String judul;
    String id;
    String tahun;
    String director;
    
    public film(){
    }
    
    public film(String judul, String id, String tahun, String director){
        this.judul = judul;
        this.id = id;
        this.tahun = tahun;
        this.director = director;
    }
    
    @Override
    public String toString(){
        return "film{" + "id = " +id+ ", judul = " +judul+ ", tahun = " +tahun+ ", director = " +director+'}';
    }
}
