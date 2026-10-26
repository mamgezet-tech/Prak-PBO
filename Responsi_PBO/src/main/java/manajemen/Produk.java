package manajemen;

public class Produk {
    // Enkapitulasi : atribut private
    private String namaProduk;
    private int harga;
    private String catatan;
    private String no_HP;
    
    // Konstruktor isi data saat objek dibuat
    public Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;        
    }
    
    public Produk(String namaProduk, int harga, String catatan) {
        this.namaProduk = namaProduk;
        this.harga = harga;    
        this.catatan = catatan;
    }
    
    public Produk(String namaProduk, int harga, String catatan, String no_HP) {
        this.namaProduk = namaProduk;
        this.harga = harga;    
        this.catatan = catatan;
        this.no_HP = no_HP;
    }
    
    // Getteer dan Setter (Akses Modifier public)
    public String getNamaProduk() {
        return namaProduk;
    }
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    //  Metode dasar yang nanti akan di override (plimorfisme)
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
        System.out.println("Catatan: " + catatan);
        System.out.println("No_HP: " + no_HP);
        
    }
    
    // Overloading
    public void tampilkanInfo(String catatan) {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
        System.out.println("Catatan: " + catatan);
        
    }
    
     public void tampilkanInfo(String catatan, String no_HP) {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
        System.out.println("Catatan: " + catatan);
        System.out.println("No_HP: " + no_HP);
        
    }
}
