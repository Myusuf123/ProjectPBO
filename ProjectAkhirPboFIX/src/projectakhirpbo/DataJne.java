
package projectakhirpbo;

public class DataJne {
int noresi;
String namapenerima;
String nohp;
String alamat,jenisbarang;

    public void setNamapenerima(String namapenerima) {
        this.namapenerima = namapenerima;
    }

    public String getNamapenerima() {
        return namapenerima;
    }

    public DataJne(int noresi, String namapenerima, String nohp, String alamat, String jenisbarang) {
        this.noresi = noresi;
        this.namapenerima = namapenerima;
        this.nohp = nohp;
        this.alamat = alamat;
        this.jenisbarang = jenisbarang;
    }


    public void setNoresi(int noresi) {
        this.noresi = noresi;
    }



    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJenisbarang(String jenisbarang) {
        this.jenisbarang = jenisbarang;
    }

    public int getNoresi() {
        return noresi;
    }


    public String getNohp() {
        return nohp;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJenisbarang() {
        return jenisbarang;
    }

  


   




   
}
