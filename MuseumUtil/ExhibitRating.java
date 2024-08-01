package HML_projects.MuseumUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class ExhibitRating {


    public static String RatingSorter(int[] inputRating){
        ArrayList<Integer> output = new ArrayList<>();
        int minIndex = 0;

        for(int i = 0; i < inputRating.length; i++){
            output.add(inputRating[i]);
        }

        int minValue = output.get(0);
        for (int i = 1; i < output.size(); i++){
            if (output.get(i) < minValue){
                minValue = output.get(i);
                minIndex = i;
            }
        }
        output.remove(minIndex);
        return Arrays.toString(output.toArray());
    }
}
