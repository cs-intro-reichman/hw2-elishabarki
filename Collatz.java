public class Collatz {
    public static void main(String args[]) {

        int n = Integer.parseInt(args[0]);
        String mode = args[1];
        int ripetition = 0;
        int num = 0;

        if (mode.equals("v")) {
            System.out.println("1 4 2 1  (4)");
            for (int i = 2; i <= n; i++) {
                num = i;
                ripetition = 0;
                while (num != 0) {
                    System.out.print(num + " ");
                    if (num % 2 == 0) {
                        num /= 2;
                    } else {
                        num = num*3+1;
                    }
                    ripetition ++;
                    if (num == 1) {  
                        ripetition ++;
                        System.out.println("1  ("+ripetition+")");  
                        num = 0;
                    }
                }    
                }
        }

        System.out.print("");
        System.out.print("Every one of the first "+n+" hailstone sequences reached 1.");
        
    }
}
