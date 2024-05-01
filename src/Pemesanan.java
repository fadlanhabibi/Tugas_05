// Kelas untuk menyimpan informasi pemesanan tiket
class Pemesanan {
    private String nama;
    private String tahap;
    private Tiket tiket;
    private int jumlah;

    public Pemesanan(String nama, String tahap, Tiket tiket, int jumlah) {
        this.nama = nama;
        this.tahap = tahap;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }

    public void cetakNota() {
        System.out.println("-- Nota Pemesanan ---");
        System.out.println("Nama Pembeli : " + nama);
        System.out.println("Tahap Pembelian : " + tahap);
        System.out.println("Jenis Tiket : " + tiket.getClass().getSimpleName());
        System.out.println("Jumlah Tiket : " + jumlah);
        System.out.println("Total Harga: Rp." + (tiket.getHarga(tahap) * jumlah));
    }
}
