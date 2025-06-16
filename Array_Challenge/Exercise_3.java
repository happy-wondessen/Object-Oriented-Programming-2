package Array_Challenge;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise_3 {

    public static void main (String[] args) {

        String[] pallets = {"B14", "A11", "B12", "A13"};

        System.out.println("Sorted ....");
        Arrays.sort(pallets);
        for (String pallet : pallets) {
            System.out.println("-- " + pallet);
        }

        System.out.println("Reversed ...");
        List<String> palletList = Arrays.asList(pallets);
        Collections.reverse(palletList);

        for(String palletLists: palletList) {
            System.out.println("---" + palletLists);
        }



    }
}
