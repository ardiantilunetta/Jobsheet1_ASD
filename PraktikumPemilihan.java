import java.util.Scanner;

public class PraktikumPemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai tugas : ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan nilai kuis : ");
        int kuis = sc.nextInt();
        System.out.print("Masukkan nilai UTS : ");
        int uts = sc.nextInt();
        System.out.print("Masukkan nilai UAS : ");
        int uas = sc.nextInt();

        System.out.println("=======================");

        if (tugas<0 || tugas>100 || kuis<0 || kuis>100 || uts<0 || uts>100 || uas<0 ||uas>100) {
            System.out.println("Nilai tidak valid");
        } else {
            double nilaiAkhir = (0.2*tugas)+(0.2*kuis)+(0.3*uts)+(0.4*uas);
            System.out.println("Nilai akhir : "+nilaiAkhir);
            String NilaiHuruf;
            if (nilaiAkhir>80 && nilaiAkhir<=100) {
                NilaiHuruf = "A";
            } else if (nilaiAkhir>73 && nilaiAkhir<=80) {
                NilaiHuruf = "B+";
            } else if (nilaiAkhir>65 && nilaiAkhir<=73) {
                NilaiHuruf = "B";
            } else if (nilaiAkhir>60 && nilaiAkhir<=65) {
                NilaiHuruf = "C+";
            } else if (nilaiAkhir>50 && nilaiAkhir<=60) {
                NilaiHuruf = "C";
            } else if (nilaiAkhir>39 && nilaiAkhir<=50) {
                NilaiHuruf = "D";
            } else {
                NilaiHuruf = "E";
            }
            System.out.println("Nilai huruf : "+NilaiHuruf);
            System.out.println("=======================");
            if (NilaiHuruf.equals("D") || NilaiHuruf.equals("E")) {
                System.out.println("Anda TIDAK LULUS");
            } else {
                System.out.println("Selamat Anda LULUS");
            }
        }

    }

}
