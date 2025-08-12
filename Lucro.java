    import java.util.Scanner;

public class Lucro {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int n, cpd, r, rt, rp, ld;
        
        while (SC.hasNext()) {
            n=SC.nextInt();
            cpd=SC.nextInt();
            rp=0;
            rt=0;
            
            for (int i=0; i<n; i++) {
                r=SC.nextInt();
                ld=r-cpd;
                rp+=ld;

                if (rp < 0) {
                    rp=0;
                }
                
                if (rp>rt) {
                    rt=rp;
                }
            }
            
            System.out.println(rt);
        }
    }
}
