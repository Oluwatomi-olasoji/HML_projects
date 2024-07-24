package assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateDetector {
    static boolean noDuplicates = true;
    static ArrayList<ArrayList<Integer>> numsAndCounts = new ArrayList<>();


    public static void detectDuplicates(int[] a) {

        Arrays.sort(a);


        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = i; j < a.length; j++) { // this for loop counts the numbers in the array
                if (a[i] == a[j]) {
                    count++;
                }
            }
            ArrayList<Integer> counts = new ArrayList<>(); //a counts array to hold each number and its counts

            if ((i >= 1 && (a[i] != a[i - 1]) || (i == 0))) { //this checks that only one instance of an element is considered

                counts.add(a[i]);
                counts.add(count);
                if (counts.get(1) > 1) { //add the element and count pair to a larger array if the count is more than one(if there are duplicates)
                    numsAndCounts.add(counts);
                }
            }
        }

        for (int i = 0; i < numsAndCounts.size(); i++) { //if there are acc numbers with duplicates

            noDuplicates = false;
            System.out.println(numsAndCounts.get(i).get(0) + " appears " + numsAndCounts.get(i).get(1) + " times");
        }
        if (noDuplicates) { //if there are no duplicates
            System.out.println("No duplicates found");
        }
    }
}


