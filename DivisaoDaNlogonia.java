import java.util.Scanner;

public class DivisaoDaNlogonia {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int k, m, n, x, y;
        String a="";
        while (true) {
            k = SC.nextInt();
            
            if (k == 0) {
                break;
            }

            n = SC.nextInt();
            m = SC.nextInt();

            for (int i=0; i<k; i++) {
                x = SC.nextInt();
                y = SC.nextInt();

                if (x==n || y==m) {
                    a = "divisa";
                } else if (x>n && y>m) {
                    a = "NE";
                } else if (x<n && y>m) {
                    a = "NO";
                } else if (x>n && y<m) {
                    a = "SE";
                } else {
                    a = "SO";
                }
                System.out.println(a);
            }
            
        }
    }
}
