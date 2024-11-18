public class Cheers {
    public static void main(String args[]) {

        String wordLowerCase = args[0];      
        String word = wordLowerCase.toUpperCase();
        int numLetters = word.length();
        int n = Integer.parseInt(args[1]);

        String lettersForAn = "AEFHILMNORSX";

        for (int i = 0; i < numLetters; i++) {   
            String letter = word.substring(i, (i+1));
            if (lettersForAn.indexOf(letter) != -1) {
                System.out.println("Give me an " + letter + ": " + letter + "!");
            } else {
                System.out.println("Give me a  " + letter + ": " + letter + "!");
            } 
        }       

        System.out.println("What does that spell?");
        for (int i = 0; i < n; i++) {  
            System.out.println(word+"!!!");      
        }       
        
    }
}
