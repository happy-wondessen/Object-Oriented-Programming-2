package Array_Challenge;

import java.util.Random;

public class Exercise_2 {

    public static void main (String[] args) {

        Random random = new Random();
        String[] StudentID = new String[5];

   for (int i = 0; i < StudentID.length; i++) {

       char prefix = (char) (random.nextInt(5) + 65);

       int number = random.nextInt(999) + 1;
       String suffix = String.format("%03d", number);

       StudentID[i] = prefix + suffix;
   }
       for (String StudentIDs : StudentID) {
           System.out.println( StudentIDs);
       }




   }


}
