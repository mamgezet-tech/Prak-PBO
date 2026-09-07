/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_3;

/**
 *
 * @author ADVAN
 */
public class Main {
    public static void main(String[] args) {
        // Objek pertama: kucing
        Hewan kucing = new Hewan("Mimi", 3);
        kucing.suara();
        kucing.info();

        System.out.println(); // Baris baru agar output rapi

        // 6) Objek kedua: anjing dan memanggil method berlari()
        Hewan anjing = new Hewan("Doggy", 2);
        anjing.info();
        anjing.berlari();
    }
    
}
