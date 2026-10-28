package praktikum9;

public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();
        Kendaraan pesawat = new Pesawat();
        Kendaraan tank = new Tank();
        
        mobil.berjalan();
        mobil.info();
        
        sepeda.berjalan();
        sepeda.info();
        
        pesawat.berjalan();
        pesawat.info();
        
        tank.berjalan();
        tank.info();
    }
    
}
