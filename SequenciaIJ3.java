public class SequenciaIJ3 {

    public static void main(String[] args) {
        int j=7, i=1;
        for (int cnt=1; cnt<=15; cnt++) {
            System.out.printf("I=%d J=%d\n", i, j);

            if (cnt%3 == 0 && cnt != 0) {
                i+=2;
                j+=4;
            } else {
                j--;
            }
        }
        
    }
}
