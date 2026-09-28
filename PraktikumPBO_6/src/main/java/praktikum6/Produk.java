package praktikum6;
// Kelas Induk Abstrak
public abstract class Produk {
    // Atribut/Variabel yang bisa diakses oleh kelas ini dan kelas turunannya (subclass)[Protected]
    protected String nama; // Menyimpan informasi nama produk (Teks)
    protected double harga; // Menyimpan informasi harga produk (Angka desimal)
// Konstruktor: Fungsi khusus yang otomatis jalan buat ngisi data pertama kali waktu objek dibuat
    public Produk(String nama, double harga) {
        // Kata kunci 'this' untuk membedakan atribut kelas dengan parameter metode
        this.nama = nama; // Memasukkan nilai parameter 'nama' ke atribut 'nama' milik objek
        this.harga = harga; // Memasukkan nilau parameter 'harga' ke atribut 'harga' milik objek
    }

    // Metode abstrak yang wajib di-override oleh kelas turunan
    // (Artinya: Kelas anak HARUS membuat rumus diskon sendiri sesuai jenis produknya)
    public abstract double hitungDiskon(); 
    // Metode biasa untuk menghitung harga akhir setelah dikurangi diskon
    public double getHargaSetelahDiskon() {
        // Mengurangi harga asli dengan hasil perhitungan diskon dari metode di atas
        return this.harga - this.hitungDiskon();
    }
    // Metode Getter untuk mengambil/melihat nilai 'nama' dari luar kelas
    public String getNama() {
        return nama;
    }
    // Metode Getter untuk mengambil/melihat nilai 'harga' dari luar kelas
    public double getHarga() {
        return harga;
    }
}
