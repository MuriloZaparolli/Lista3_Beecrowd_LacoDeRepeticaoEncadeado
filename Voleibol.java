import java.util.Scanner;

public class Voleibol {
    final static Scanner SC = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n, sA=0, bA=0, aA=0, sB=0, bB=0, aB=0;
        float sF, bF, aF;
        n=SC.nextInt();
        for (int i=0; i<n; i++) {
            SC.next();
            sA+=SC.nextInt();
            bA+=SC.nextInt();
            aA+=SC.nextInt();
            sB+=SC.nextInt();
            bB+=SC.nextInt();
            aB+=SC.nextInt();
        }
        sF=(float)sB/sA*100;
        bF=(float)bB/bA*100;
        aF=(float)aB/aA*100;
        System.out.printf("Pontos de Saque: %.2f %%.\nPontos de Bloqueio: %.2f %%.\nPontos de Ataque: %.2f %%.\n", sF, bF, aF);
    }
}
