package manajemen;

public class PegawaiKontrak extends Pegawai{
    private int lamaKontrak; // dalam bulan
    
    public PegawaiKontrak(String namaPegawai, int gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }
    
    public int getLamaKontrak() {
        return lamaKontrak;
    }
    
    public void setLamaKontrak(int lamaKontrak) {
        this.lamaKontrak = lamaKontrak;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + getNamaPegawai());
        System.out.println("Gaji: " + getGaji());
        System.out.println("Lama Kontrak: " + lamaKontrak + " bulan");
    }    
}
