package praktikum.tugas7;

public class Main {
    private static final int KUE_MAX = 20;
    private static final Kue[] daftarKue = new Kue[KUE_MAX];

    public static void tambahKue(Kue kue) {
        for (int i = 0; i < KUE_MAX; i++) {
            if (daftarKue[i] == null) {
                daftarKue[i] = kue;
                break;
            }
        }
    }
        
    public static void main(String[] args) {
        tambahKue(new KueJadi("Brownies", 50000, 2));
        tambahKue(new KueJadi("Donat", 20000, 5));
        tambahKue(new KueJadi("Kue Lapis", 30000, 3));
        tambahKue(new KueJadi("Kue Nastar", 40000, 1));
        tambahKue(new KueJadi("Kue Putri Salju", 35000, 2));
        tambahKue(new KueJadi("Kue Sus", 25000, 4));
        tambahKue(new KueJadi("Kue Lumpur", 30000, 5));
        tambahKue(new KueJadi("Kue Bolu", 45000, 2));
        tambahKue(new KueJadi("Kue Tart", 60000, 8));
        tambahKue(new KueJadi("Kue Apem", 15000, 6));

        tambahKue(new KuePesanan("Kue Ulang Tahun", 100000, 2.5));
        tambahKue(new KuePesanan("Kue Pernikahan", 200000, 5));
        tambahKue(new KuePesanan("Kue Kering", 50000, 3));
        tambahKue(new KuePesanan("Kue Basah", 30000, 4));
        tambahKue(new KuePesanan("Kue Tradisional", 25000, 3.5));
        tambahKue(new KuePesanan("Kue Modern", 40000, 2.8));
        tambahKue(new KuePesanan("Kue Coklat", 45000, 3.2));
        tambahKue(new KuePesanan("Kue Keju", 50000, 2.7));
        tambahKue(new KuePesanan("Kue Pisang", 20000, 4.5));
        tambahKue(new KuePesanan("Kue Mangkok", 15000, 5));
        
        // 3a. Menampilkan semua kue
        System.out.println("=====Daftar Kue=====");
        for (Kue kue : daftarKue) {
            if (kue != null) {
                System.out.println(kue);
            }
        }

        // 3b. Menampilkan total harga semua kue
        System.out.println("=====Rincian Kue=====");
        double totalHargaSemuaKue = 0;
        for (Kue kue : daftarKue) {
            if (kue != null) {
                totalHargaSemuaKue += kue.hitungHarga();
            }
        }
        System.out.println("> Total Harga Semua Kue: Rp." + totalHargaSemuaKue);

        // 3c. Menampilkan total harga dan berat kue pesanan
        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KuePesanan) {
                totalHargaKuePesanan += kue.hitungHarga();
                totalBeratKuePesanan += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.println("> Total Harga Kue Jadi: Rp." + totalHargaKuePesanan);
        System.out.println("> Total Berat Kue Pesanan: " + totalBeratKuePesanan + " kg");
        
        // 3d. Menampilkan total harga dan jumlah kue jadi
        double totalHargaKueJadi = 0;
        double totalJumlahKueJadi = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KueJadi) {
                totalHargaKueJadi += kue.hitungHarga();
                totalJumlahKueJadi += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println("> Total Harga Kue Pesanan: Rp." + totalHargaKueJadi);
        System.out.println("> Total Jumlah Kue Jadi: " + totalJumlahKueJadi + " pcs");

        // 3e. Menampilkan kue termahal
        Kue kueMahal = daftarKue[0];
        for (Kue kue : daftarKue) {
            if (kue != null && kue.hitungHarga() > kueMahal.hitungHarga()) {
                kueMahal = kue;
            }
        }
        System.out.println("> Kue Termahal: " + kueMahal.getNama() + " dengan harga Rp." + kueMahal.hitungHarga());
    }
}

