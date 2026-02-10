import java.util.Scanner;

public class PraktikumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah : ");
        int jmk = sc.nextInt();
        sc.nextLine();

        String[] MK = new String[jmk];
        int[] BobotSKS = new int[jmk];
        String[] NilaiHuruf = new String[jmk];
        double[] NilaiSetara = new double[jmk];

        for (int i = 0 ; i < jmk ; i++) {
            System.out.println("-----"+(i+1)+"-----");
            System.out.print("Masukkan nama mata kuliah : ");
            MK[i] = sc.nextLine();
            System.out.print("Masukkan bobot SKS : ");
            BobotSKS[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan nilai huruf : ");
            NilaiHuruf[i] = sc.nextLine();
        }

        for (int i = 0 ; i < jmk ; i++) {
            if (NilaiHuruf[i].equalsIgnoreCase("A")) {
                NilaiSetara[i] = 4;
            } else if (NilaiHuruf[i].equalsIgnoreCase("B+")) {
                NilaiSetara[i] = 3.5;
            } else if (NilaiHuruf[i].equalsIgnoreCase("B")) {
                NilaiSetara[i] = 3;
            } else if (NilaiHuruf[i].equalsIgnoreCase("C+")) {
                NilaiSetara[i] = 2.5;
            } else if (NilaiHuruf[i].equalsIgnoreCase("C")) {
                NilaiSetara[i] = 2;
            } else if (NilaiHuruf[i].equalsIgnoreCase("D")) {
                NilaiSetara[i] = 1;
            } else if (NilaiHuruf[i].equalsIgnoreCase("E")) {
                NilaiSetara[i] = 0;
            }
        }

        double totalNilai = 0;
        int totalSKS = 0;

        for (int i = 0; i < jmk; i++) {
            totalNilai += NilaiSetara[i] * BobotSKS[i];
            totalSKS += BobotSKS[i];
        }

        double IP = totalNilai / totalSKS;
        System.out.print("IP : "+IP);
    }
}
