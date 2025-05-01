package praktikum.tugas7;

abstract class Kue {
    private String nama;
    private double harga;

    public abstract double hitungHarga();

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }
    
    public double getHarga() {
        return harga;
    }

    public String toString() {
        return "Nama Kue: " + nama + "\n" +
                "Harga Kue: Rp." + harga + "\n";
    }
}
