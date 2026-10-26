package manajemen;

public class Makanan extends Produk {
    private String tanggalKadaluarsa;
    
    public Makanan(String namaProduk, int harga, String tanggalKadaluarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    } 
    public String getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }
    public void setTanggalKadaluarsa(String tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + getNamaProduk());
        System.out.println("Harga: " + getHarga());
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);   
    }    
}
