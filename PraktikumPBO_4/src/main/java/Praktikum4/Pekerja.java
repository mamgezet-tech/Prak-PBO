package Praktikum4;

public class Pekerja {
    private String nama;
    private int usia;
    private String pekerjaan;
    private double gaji;

    // Constructor
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
        this.gaji = gaji;
    }

    // Setter untuk mengubah nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk nama (opsional, jika dibutuhkan)
    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return "Pekerja [" +
                "Nama='" + nama + '\'' +
                ", Usia=" + usia +
                ", Pekerjaan='" + pekerjaan + '\'' +
                ", Gaji=Rp " + String.format("%,.2f", gaji) +
                ']';
    }
}