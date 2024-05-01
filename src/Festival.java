// Kelas turunan untuk tiket Festival
class Festival extends Tiket {
    @Override
    int getHarga(String tahap) {
        if (tahap.equalsIgnoreCase("presale")) {
            return 100;
        } else {
            return 100; // Harga reguler sama dengan harga presale
        }
    }
}