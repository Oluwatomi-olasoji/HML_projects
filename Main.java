package assignments;
import static assignments.CentralTendencyUtil.*;
import static assignments.DuplicateDetector.detectDuplicates;

public class Main {
    public static void main(String[] args) {
        int[] testArray = {1,2,3};
        double  median = findMedian(testArray);
        double mean = calculateMean(testArray);
        double mode = calculateMode(testArray);

        System.out.println("The median of the array is " + median);
        System.out.println("The mean of the array is "+ mean);
        System.out.println("The mode of the array is "+ mode + "\n");

        detectDuplicates(testArray);
    }
}
