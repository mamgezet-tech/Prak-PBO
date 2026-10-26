package manajemen;

public class Pegawai {
    // Enkapitulasi : atribut diprivate
    private String namaPegawai;
    private int gaji;
    // Konstruktor 
    public Pegawai(String namaPegawai, int gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    // Getter dan Setter (Akses Modifier)
    public String getNamaPegawai() {
        return namaPegawai;       
    }
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    public int getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    // Metode dasar tampilkan
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji: " + gaji);
    }
}
