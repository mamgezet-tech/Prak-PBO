package praktikum9;

abstract class Kendaraan {
    // metode abstrak
    abstract void berjalan();
    
    // metode dengan implementasi
    void info() {
        System.out.println("Ini adalah kendaraan.");
    }
    
}

class Mobil extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Mobil sedang berjalan dengan cepat.");
    }     
}


class Sepeda extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Sepeda sedang berjalan dengan pelan.");
    }    
}

class Pesawat extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Pesawat sedang berjalan dengan sayapnya.");
    }    
}

class Tank extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Tank sedang berjalan dengan merayap.");
    }    
}
