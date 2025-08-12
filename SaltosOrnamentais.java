import java.util.Scanner;

public class SaltosOrnamentais {
    final static Scanner SC = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n;
        float gd, nt, mr, mn, s;
        String c;
        n=SC.nextInt();
        for (int i=0; i<n; i++) {
            c=SC.next();
            gd = SC.nextFloat();
            s=0;
            mr=0;
            mn=10;
            for (int j=0; j<7; j++) {
                nt = SC.nextFloat();
                if (nt > mr) {
                    mr=nt;
                } if (nt < mn) {
                    mn=nt;
                }
                s+=nt;
            }
            s-=mr+mn;
            s*=gd;
            System.out.printf("%s %.2f\n", c, s);
        }
    }
}
