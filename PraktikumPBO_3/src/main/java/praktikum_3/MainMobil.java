/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_3;

public class MainMobil {
public static void main(String[] args) {
Mobil mobil1 = new Mobil("Toyota", "Avanza", 2021, "Hitam");
Mobil mobil2 = new Mobil("Honda", "Civic", 2023, "Merah");

    mobil1.startEngine();
    mobil1.displayInfo();

    mobil2.startEngine();
    mobil2.displayInfo();

    System.out.println("=== Setelah Perubahan Warna ===");
    mobil1.setWarna("Putih");
    mobil1.displayInfo();
}
}
