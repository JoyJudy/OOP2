package Class_Challenges.ArrayChallenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortReverse {
    public static void main(String[] args) {
        //Initial array of pallet IDs
        String[] pallets = {"B14", "A11", "B12", "A13"}; //initialize an array 'pallets' of type String that has 4 elements

        //Sort the array in ascending order
        System.out.println("Sorted     ");
        Arrays.sort(pallets); //sorts the array alphabetically
        for (String pallet : pallets){
            System.out.println("  " + pallet);
        }

        //Reverse the sorted array
        System.out.println("\nReversed    ");
        List<String> palletList = Arrays.asList(pallets); //creating a lists object
        Collections.reverse(palletList); //Reverses the order of the sorted list

        for (String pallet : palletList){
            System.out.println("  " + pallet);
        }
    }
}
