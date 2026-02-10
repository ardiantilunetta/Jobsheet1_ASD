import java.util.Scanner;

public class Tugas2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal);
        int menu;

        do {
            System.out.print("1. Tampilkan seluruh jadwal\n2. Tampilkan jadwal berdasarkan hari\n3. Tampilkan jadwal berdasarkan mata kuliah\n4. Keluar\nPilih menu : ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    tampilJadwal(jadwal);
                    break;
            
                case 2:
                    System.out.print("\nCari jadwal berdasarkan hari: ");
                    String hari = sc.nextLine();
                    berdasarkanHari(jadwal, hari);
                    break;

                case 3:
                    System.out.print("\nCari jadwal berdasarkan nama mata kuliah: ");
                    String mk = sc.nextLine();
                    berdasarkanMK(jadwal, mk);
                    break;

                default:
                    break;
            }
            System.out.println();
        } while (menu != 4);

    }

    static void inputJadwal(String[][] jadwal) {
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("Jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam : ");
            jadwal[i][3] = sc.nextLine();
            System.out.println();
        }
    }

    static void tampilJadwal(String[][] jadwal) {
        System.out.println("\n=== JADWAL KULIAH ===");
        System.out.println("Mata Kuliah | Ruang | Hari | Jam");
        System.out.println("--------------------------------");

        for (int i = 0; i < jadwal.length; i++) {
            System.out.println(
                jadwal[i][0] + " | " +
                jadwal[i][1] + " | " +
                jadwal[i][2] + " | " +
                jadwal[i][3]
            );
        }
    }

    static void berdasarkanHari(String[][] jadwal, String hari) {
        boolean ditemukan = false;

        System.out.println("\nJadwal hari " + hari + ":");
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(
                    jadwal[i][0] + " | " +
                    jadwal[i][1] + " | " +
                    jadwal[i][3]
                );
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    static void berdasarkanMK(String[][] jadwal, String mk) {
        boolean ditemukan = false;

        System.out.println("\nJadwal mata kuliah " + mk + ":");
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println(
                    jadwal[i][1] + " | " +
                    jadwal[i][2] + " | " +
                    jadwal[i][3]
                );
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}
