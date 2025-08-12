import java.util.Scanner;

public class BatalhaDePomekons {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int t, b;
        int[] a = new int[2];
        int[] d = new int[2];
        int[] l = new int[2];
        int[] tr = new int[2];
        t = SC.nextInt();
        for (int i=0; i<t; i++) {
            b = SC.nextInt();
            for (int j=0; j<a.length; j++) {
                a[j] =SC.nextInt();
                d[j] =SC.nextInt();
                l[j] =SC.nextInt();
                tr[j] = (a[j]+d[j])/2;
                if (l[j]%2 == 0) {
                    tr[j] += b;
                }
            }
            if (tr[0] > tr[1]) {
                System.out.println("Dabriel");
            } else if (tr[1] > tr[0]) {
                System.out.println("Guarte");
            } else {
                System.out.println("Empate");
            }
        }
    }
}
