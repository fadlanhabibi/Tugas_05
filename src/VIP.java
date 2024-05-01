// Kelas turunan untuk tiket VIP
class VIP extends Tiket {
   @Override
   int getHarga(String tahap) {
      if (tahap.equalsIgnoreCase("presale")) {
         return (int) (150 * 0.8); // Diskon 20% untuk presale
      } else {
         return 150;
      }
   }
}