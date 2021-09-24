import java.io.*;
import java.lang.String;

public class ProbOne {
    public static void main ( final String[] args ) throws IOException {

            final String[] listing = reader(); 
            final int answer = checker(listing);
            System.out.println(answer);
    }

    public static String[] reader () throws IOException {

        final int max_lines = 16384;
        final String[] temp = new String[max_lines];
        int i = 0; 

        try(BufferedReader br = new BufferedReader(new FileReader("input"))) {
                for(String line; (line = br.readLine()) != null; ) {
                        temp[i] = line;
                        i++;
                }
         }

         final String[] listing = new String[i];
         
         for (  i = 0; i <listing.length; i++) {
             listing[i] = temp[i];
         }

         return listing;
    }

    public static int checker(final String[] listing) {

        int count = 0;
        final int[] temp2 = new int[listing.length];

        for (int i = 0; i<listing.length; i++) {

                temp2[i] = Integer.parseInt(listing[i]) / 3 - 2;
                count += temp2[i];
        }

        return count;
    }

}


