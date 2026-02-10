public class PraktikumFungsi {

    public static void main(String[] args) {
        int[][] stok = {
            {10, 5, 15, 7}, // RoyalGarden 1
            {6, 11, 9, 12}, // RoyalGarden 2
            {2, 10, 10, 5}, // RoyalGarden 3
            {5, 7, 12, 9}   // RoyalGarden 4
        };
        int[] harga = {75000, 50000, 60000, 10000};

        for (int i = 0; i < 4; i++) {
            int pendapatan = hitungPendapatanCabang(stok[i], harga);
            String status = tentukanStatus(pendapatan);
            System.out.println("Pendapatan RoyalGarden " + (i + 1) + " = Rp" + pendapatan);
            System.out.println("Status : " + status);
            System.out.println();
        }
    }

    static int hitungPendapatanCabang(int[] stok, int[] harga) {
        int total = 0;
        for (int i = 0; i < stok.length; i++) {
            total += stok[i] * harga[i];
        }
        return total;
    }

    static String tentukanStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }
}