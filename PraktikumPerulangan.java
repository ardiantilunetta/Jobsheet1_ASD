import java.util.Scanner;

public class PraktikumPerulangan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input NIM : ");
        long NIM = sc.nextLong();

        long n = NIM%100;
        if (n<10) {
            n += 10;
        }
        System.out.println("N = "+n);

        for (int i = 1 ; i <= n ; i++) {

             if (i == 10 || i == 15) {
                continue;
            }

            if (i%3 == 0) {
                System.out.print("# ");
            } else if (i%2 == 0) {
                System.out.print(i+" ");
            } else if (i%2 == 1) {
                System.out.print("* ");
            }

        }
    }
}
