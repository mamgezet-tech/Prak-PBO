/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Praktikum4;

public class PraktikumPBO_4 {
    public static void main(String[] args) {
        // Membuat objek dari subclass Mobil
        Mobil mobilSedan = new Mobil("Sedan Mewah", 240, "Bensin", 4);

        // Memanggil method untuk menampilkan informasi mobil
        System.out.println("=== INFORMASI MOBIL ===");
        mobilSedan.tampilkanInfoMobil();
    }
}