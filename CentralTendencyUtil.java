package assignments;

import java.util.*;

public class CentralTendencyUtil {


    public static double calculateMean(int[] a){
        double sum = 0;
        if (a.length == 0){
            System.out.println("The array is empty");
        }
        else {
            for ( int i = 0; i < a.length; i++){
                sum += a[i];
            }
            return (sum/a.length);
        }
        return sum;
    }

    public static double calculateMode(int[] a) {
        int maxValue = 0, maxCount = 0;
        Set<Integer> counts = new HashSet<Integer>();

        Arrays.sort(a); // 1 1 2
        for (int i = 0; i < a.length; i++){
            int count  =  0;
            for (int j = i; j < a.length; j++){
                if (a[j] == a[i]){ //while an elements is equal to the element beside it, increment count (array is sorted)
                    count++;
                }
            }
            if (i >= 1 && (a[i] != a[i - 1]) || (i == 0) ){ //this checks that only one instance of an element is considered, only runs when we are at the last instance of that element
                counts.add(count); //sets don't allow duplicate entries if all the elements have the same count it the set will contain one element
                if (count >= maxCount ){
                    maxCount = count;
                    maxValue = a[i];
                }
            }
        }

        if (counts.size() == 1){ //this condition will be true if the count of any element is not more tahn 1
            return -1;
        }

        return maxValue;
    }


    public static double findMedian(int[] a){
        //int[] sorted = new int[a.length];
        Arrays.sort(a); //sorts the array in place
        double median;

        if( a.length % 2 == 0.0 && a.length != 0){ //if the array has an even length and isn't empty
            int mid = (a.length / 2)-1;
            median = (double) (a[mid] + a[mid + 1]) /2;
        }
        else if (a.length % 2 == 1.0 ){
            int mid = ((a.length + 1) / 2) - 1;
            median = (double) (a[mid]);
        }
        else{
            median = -1;
        }
        return median;
    }

}
/*   public static double calculateMode(int[] a) {
        int maxValue = 0, maxCount = 0, uniqueElementsCounter = 1;

        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            int count = 0;

            if (a[i] != a[i + 1]) { //gets the number of unique elements in the array
                uniqueElementsCounter++;
            }
        }
            int[][] uniqueElements = new int[2][uniqueElementsCounter]; //make an array to store the unique elements
           // int[] elementsCount = new int[uniqueElementsCounter];

            uniqueElements[0][0] = a[i]; //sets the first elements of the unique elements
            for (int i = 1; i < uniqueElementsCounter; i ++){
                for (int j = 0; j < a.length; j ++){
                    if (a[j] != a[j + 1]) {
                        uniqueElements[i] = a[j + 1];
                    }
                }

            }

            for (int j = 0; j < a.length; j++){
                if (a[j] == a[i]){
                    count++;
                }

                if (count > maxCount ){
                    maxCount = count;
                    maxValue = a[j];
                }
            }

        return maxValue;
    }*/
//    public static List<Integer> comprehensiveCalculateMode(int[] a) {
//        int maxValue = 0, maxCount = 0;
//        Map<Integer,Integer> map = new HashMap<>();
//        Set<Integer> num = new HashSet<Integer>(); //to keep track of counts
//        List<Integer> modes = new ArrayList<>();
//
//        Arrays.sort(a);
//        for (int i = 0; i < a.length; i++){
//            int count  =  0;
//            for (int j = i; j < a.length; j++){
//
//                if (a[j] == a[i]){
//                    count++;
//                }
//                if (count > maxCount ){
//                    maxCount = count;
//                    maxValue = a[j];
//
//                    // continue;
//                }
//                //break;
//
//            }
//            //map.va
//
//        }
//        return maxValue;