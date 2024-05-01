// Kelas turunan untuk tiket VVIP
class VVIP extends Tiket {
    @Override
    int getHarga(String tahap) {
        if (tahap.equalsIgnoreCase("presale")) {
            return (int) (200 * 0.8); // Diskon 20% untuk presale
        } else {
            return 200;
        }
    }
}