package HML_projects.MuseumUtil;

import java.util.Arrays;

import static HML_projects.MuseumUtil.ExhibitRating.RatingSorter;

public class RatingSystemRunner {
    public static void main(String[] args) {
        int[] a = {2,5,1,4,3,1,2};
        String result = RatingSorter(a);
        System.out.println(result);
        System.out.println(Arrays.toString(a));
    }
}
