package manajemen;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------Output Produk-------");
        // Polimorfisme 
        Produk produk1 = new Elektronik("Laptop", 15000000, 2);
        produk1.tampilkanInfo();
        
        // nampilin produk  asli tanpa overridng
        System.out.println();
        Produk produk2 = new Produk("HP", 3000000);
        produk2.tampilkanInfo();
        
        System.out.println();
        Produk produk3 = new Produk("Printer", 4000000, "Jelek");
        produk3.tampilkanInfo();
        
        System.out.println();
        Produk produk4 = new Produk("Mobil", 3000, "Good", "0888999222");
        produk4.tampilkanInfo();
        
        System.out.println("\n-------Output Pegawai-------");
        
        Pegawai pegawai1 = new PegawaiTetap("Ghozali", 50000000, 1000000);
        pegawai1.tampilkanInfo();

        System.out.println("\n--------Output Polimorfisme-------");
        // variable produk objek makanan
        Produk produk5 = new Makanan("Snak", 15000, "2023-12-30");
        produk5.tampilkanInfo();
       
        // spasi kosong
        System.out.println();
        
        // variabel pegawai objek pegawai kontrak
        Pegawai pegawai2 = new PegawaiKontrak("Andi", 3000000, 12);
        pegawai2.tampilkanInfo();
       
        System.out.println();
        
        // ambil data aawal pakai GET
        System.out.println("Nama awal (Getter): " + produk2.getNamaProduk());
        System.out.println("Harga awal (Getter): " + produk2.getHarga());

        // ubah data dari luar pakai SET
        produk2.setNamaProduk("Smartphone");
        produk2.setHarga(5000000);

        // periksa kembali data yang sudah diubah pakai GET
        System.out.println("Nama baru setelah Setter: " + produk2.getNamaProduk());
        System.out.println("Harga baru setelah Setter: " + produk2.getHarga());
    }    
}
