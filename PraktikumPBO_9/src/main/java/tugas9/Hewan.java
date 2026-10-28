package tugas9;

abstract class Hewan {
    // metode abstrak
    abstract void suara();
    
    // metode dengan implementasi
    void info() {
        System.out.println("");
    }
    
}

class Kucing extends Anjing{
    @Override
    void suara() {
        System.out.println("Kucing mengeluarkan suara : Mew mew");
    }     
}


class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Anjing mengeluarkan suara : Gok gok");
    }    
}
