import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");

        System.out.print("Masukkan nama pembeli: ");
        String namaPembeli = scanner.nextLine();

        while (true) {
            System.out.println("\nPilih tahap pembelian:");
            System.out.println("1. Presale");
            System.out.println("2. Reguler");
            System.out.print("Pilih tahap pembelian (1/2): ");
            String tahap = scanner.nextLine();

            if (tahap.equals("1") || tahap.equalsIgnoreCase("presale")) {
                tahap = "presale";
            } else if (tahap.equals("2") || tahap.equalsIgnoreCase("reguler")) {
                tahap = "reguler";
            } else {
                System.out.println("Input tidak valid!");
                break;
            }

            String jenisTiket;
            if (tahap.equals("presale")) {
                System.out.println("\nPilih Jenis tiket:");
                System.out.println("1. VIP");
                System.out.println("2. VVIP");
                System.out.print("Pilih Jenis Tiket (1/2): ");
                jenisTiket = scanner.nextLine();
            } else {
                System.out.println("\nPilih Jenis tiket:");
                System.out.println("1. Festival");
                System.out.println("2. VIP");
                System.out.println("3. VVIP");
                System.out.print("Pilih Jenis Tiket (1/2/3): ");
                jenisTiket = scanner.nextLine();
            }

            Tiket tiket;
            switch (jenisTiket) {
                case "1":
                    if (tahap.equals("presale")) {
                        tiket = new VIP();
                    } else {
                        tiket = new Festival();
                    }
                    break;
                case "2":
                    if (tahap.equals("presale")) {
                        tiket = new VVIP();
                    } else {
                        tiket = new VIP();
                        break;
                    }
                case "3":
                    if (tahap.equals("reguler")) {
                        tiket = new VVIP();
                        break;
                    }
                default:
                    System.out.println("Input tidak valid!");
                    return;
            }

            System.out.print("Masukkan Jumlah Tiket yang ingin dibeli: ");
            int jumlahTiket = Integer.parseInt(scanner.nextLine());

            Pemesanan pesanan = new Pemesanan(namaPembeli, tahap, tiket, jumlahTiket);
            pesanan.cetakNota();

            System.out.println("\nIngin melakukan pemesanan lagi? (Ya/Tidak)");
            String jawab = scanner.nextLine();
            if (!jawab.equalsIgnoreCase("Ya")) {
                break;
            }
        }
        scanner.close();
    }
}
