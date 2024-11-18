public class CalcPi {
    public static void main(String args[]) {

        int n = Integer.parseInt(args[0]);
        double pi = 0.0;  
        System.out.println("pi according to Java: " + Math.PI);

        for (int i = 0; i < n; i++) {
        double d = ( (Math.pow(-1, i))/(i*2+1) ); 
        pi += d;
        }
        pi *= 4;

        System.out.println("pi, approximated:     " + pi);
        
    }
}
