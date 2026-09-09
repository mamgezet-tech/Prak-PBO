package Praktikum4;

public class Main {
    public static void main(String[] args) {
        // 1. Membuat objek Pekerja awal
        Pekerja pekerja1 = new Pekerja("Andi", 30, "Data Scientist", 12000000);

        // Menampilkan informasi pekerja awal
        System.out.println("Data Awal:");
        System.out.println(pekerja1.toString());

        // 2. Mengubah nama pekerja menggunakan metode setter
        pekerja1.setNama("Andi Pratama");

        // 3. Menampilkan ulang informasi pekerja setelah diubah
        System.out.println("\nData Setelah Nama Diubah:");
        System.out.println(pekerja1.toString());
    }
}