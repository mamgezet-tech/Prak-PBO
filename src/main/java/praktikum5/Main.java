package praktikum5;

// 1 Kelas Induk "Kendaraan"
class Kendaraan {
    String nama;
    int kecepatan;

    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}

// 2&3 Kelas Turunan "Mobil" dengan Overriding method tampilkanInfo()
class Mobil extends Kendaraan {
    int jumlahPintu;

    // Overriding metode tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        System.out.println("----Info Mobil----");
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }

    public void tampilkanInfoMobil() {
        tampilkanInfo();
    }
}

// 4 Kelas Turunan Baru "SepedaMotor"
class SepedaMotor extends Kendaraan {
    String jenisMesin;

    @Override
    public void tampilkanInfo() {
        System.out.println("--- Informasi Sepeda Motor ---");
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}
// Kelas Utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobilKu = new Mobil();
        mobilKu.nama = "Lambo Avanza";
        mobilKu.kecepatan = 900;
        mobilKu.jumlahPintu = 9;
        
        // Memanggil method dari objek Mobil
        mobilKu.tampilkanInfo();
        
        System.out.println(); // Baris kosong pemisah

        // Membuat objek SepedaMotor
        SepedaMotor motorKu = new SepedaMotor();
        motorKu.nama = "Vario Ngabers";
        motorKu.kecepatan = 190;
        motorKu.jenisMesin = "9-Tak";
        
        // Memanggil method dari objek SepedaMotor
        motorKu.tampilkanInfo();
    }
}