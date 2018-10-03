import java.lang.String;

public class Lab3 {

    private static Boolean isValidDNA(String input){

        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) != 'A' && input.charAt(i) != 'C' && input.charAt(i) != 'T' && input.charAt(i) != 'G'){
                return false;
            }
        }

        return true;
    }

    private static String complementWC(String input){

        if (isValidDNA(input)) {

            System.out.println(input);
            String results = "";

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'A') results += 'T';
                else if (input.charAt(i) == 'T') results += 'A';
                else if (input.charAt(i) == 'C') results += 'G';
                else if (input.charAt(i) == 'G') results += 'C';
                else return "Error: Please enter a valid DNA String.";
            }

            return results;
        }
        else return "Error: Please enter a valid DNA String.";
    }

    public static void main(String[] args){
        System.out.println(complementWC(args[0]));
    }
}
