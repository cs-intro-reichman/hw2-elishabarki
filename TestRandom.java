public class TestRandom {
    public static void main(String args[]) {

        int N = Integer.parseInt(args[0]);
        int more = 0;
        int less = 0;
        for (int i = 0; i < N; i++) {           
            double a = (Math.random());
            if (a > 0.5) {
                more += 1;
            }
            if (a <= 0.5){
                less += 1;
            }
        }       
        System.out.println("> 0.5:  "+more+" times");
        System.out.println("<= 0.5: "+less+" times");

        if ((more > 0) && (less > 0)){
            double ratio = (double) more/less;
            System.out.println("Ratio:  "+ratio);
        }

    }
}
