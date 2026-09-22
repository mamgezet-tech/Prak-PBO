package ptugas5;
// 1 PEWARISAN & OVERRIDING (Hewan)

// Kelas Induk "Hewan"
class Hewan {
    String nama;
    String jenis;

    public void tampilkanInfo() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Jenis: " + jenis);
    }
}

// Kelas Turunan "Kucing" (melakukan Overriding)
class Kucing extends Hewan {
    public void tampilkanSuara() {
        System.out.println("Suara: Meww...Meww");
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("====Info Kucing===");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        tampilkanSuara();
    }
}

// Kelas Turunan "Anjing" (Melakukan Overriding)
class Anjing extends Hewan {
    public void tampilkanSuara() {
        System.out.println("Suara: Gok!Gok!Gok1");
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("====Info Anjing===");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        tampilkanSuara();
    }
}

// 2 HIERARKI PEWARISAN 3 LEVEL (Kendaraan)

// Level 1 : Kelas Induk Utama
class Kendaraan {
    String merk;
    int tahun;

    public void tampilkanInfoKendaraan() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
    }
}

// Level 2 : Kelas Menengah (Turunan dari Kendaraan)
class KendaraanDarat extends Kendaraan {
    int jumlahRoda;

    public void tampilkanInfoDarat() {
        tampilkanInfoKendaraan();
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}

// Level 3A : Kelas Turunan (Turunan dari KendaraanDarat)
class MobilLevel3 extends KendaraanDarat {
    int jumlahPintu;

    @Override
    public void tampilkanInfoKendaraan() {
        System.out.println("----Spek Mobil----");
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
        System.out.println("Jumlah Roda: " + jumlahRoda);
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

// Level 3B : Kelas Turunan (Turunan dari KendaraanDarat)
class SepedaMotorLevel3 extends KendaraanDarat {
    String jenisRantai;

    @Override
    public void tampilkanInfoKendaraan() {
        System.out.println("----Spek Sepeda Motor---");
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}

// 3. KELAS UTAMA UNTUK RUN

public class Maintugas {
    public static void main(String[] args) {
        System.out.println("====PENGUJIAN KELAS HEWAN & OVERRIDING====\n");
        
        // Objek Kucing
        Kucing kucingKu = new Kucing();
        kucingKu.nama = "Entong";
        kucingKu.jenis = "Ras : Jawa";
        kucingKu.tampilkanInfo();
        
        System.out.println();

        // Objek Anjing
        Anjing anjingKu = new Anjing();
        anjingKu.nama = "Bleki";
        anjingKu.jenis = "Ras : Hitam";
        anjingKu.tampilkanInfo();

        System.out.println("\n==========================================");
        System.out.println("====PENGUJIAN HIERARKI KENDARAAN (3 LEVEL)====\n");

        // Objek Mobil (Hierarki 3 Level)
        MobilLevel3 mobil = new MobilLevel3();
        mobil.merk = "Honda Yamaha";
        mobil.tahun = 2029;
        mobil.jumlahRoda = 4;
        mobil.jumlahPintu = 10;
        mobil.tampilkanInfoKendaraan();

        System.out.println();

        // Objek Sepeda Motor (Hierarki 3 Level)
        SepedaMotorLevel3 motor = new SepedaMotorLevel3();
        motor.merk = "Suzuki XR99";
        motor.tahun = 2029;
        motor.jumlahRoda = 2;
        motor.tampilkanInfoKendaraan();
    }
}