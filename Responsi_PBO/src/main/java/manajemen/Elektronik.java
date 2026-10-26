package manajemen;

public class Elektronik extends Produk {
    private int garansi; // dalam tahun
    
    public Elektronik(String namaProduk, int harga, int garansi) {
        super(namaProduk, harga); // super() memanggil konstruktor kelas induk(Produk) 
        this.garansi = garansi;
    }   
    public int getGaransi() {
        return garansi;
    }
    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }
    // Polimorfisme (Override) : Modifikasi metode tampilkanInfo() sesuai kebutuhan kelas Elektronik 
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + getNamaProduk());
        System.out.println("Harga: " + getHarga()); 
        System.out.println("Garansi: " + garansi + " tahun");
    }   
}
