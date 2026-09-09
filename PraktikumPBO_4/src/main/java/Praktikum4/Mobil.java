/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum4;

public class Mobil extends Kendaraan {
    private int jumlahPintu; // Atribut tambahan khusus untuk mobil

    // Constructor
    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin); // Memanggil constructor dari kelas induk
        this.jumlahPintu = jumlahPintu;
    }

    // Method untuk menampilkan informasi mobil
    public void tampilkanInfoMobil() {
        // Dapat mengakses 'nama' menggunakan getter karena private di induk
        System.out.println("Nama Mobil (via Getter): " + getNama());
        // Dapat mengakses 'kecepatanMaks' secara langsung karena berstatus protected
        System.out.println("Kecepatan Maksimum Mobil: " + kecepatanMaks + " km/h");
        System.out.println("Jenis Mesin (public): " + jenisMesin);
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}