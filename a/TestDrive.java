package HML_projects.a;

import java.util.Set;
import java.util.HashSet;

public class TestDrive {

    static int[] x= {1,2,3,4,5,6,6,7,8,9,10};
    Set<Integer> num = new HashSet<Integer>();

    public TestDrive()
    {
        isFeedValid();
    }




    public boolean isFeedValid()//int [] a
    {
       // num
        try
        {
            for(int i=0;i<x.length;i++)
            {
                 if(!num.contains(i)) {
                     num.add(i);
                 }
                 else
                 {

                     System.out.println(" duplicate = " + i);
                 }
                 /*
                 else
                 {
                     throw new  IllegalArgumentException("Wahala Bad Argument passed!!");
                 }*/
            }

            num.stream().forEach(x->System.out.println("Tomi see -->> "+x));
           // System.out.println(" = " + );

        }
        catch(Exception e)
        {
           e.printStackTrace();
        }
     return false;
    }

    public void doMode(int [] a)
    {
        try
        {
           for(int i=0;i<a.length;i++)
           {
               System.out.println("i = " + i);
               if(!num.contains(i))
               {
                   num.add(i);
               }
           }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        try {

            TestDrive td = new TestDrive();
            td.num.stream().forEach(i ->

                    {
                            System.out.println("i = " + i+"  -- dup "+td.num.contains(i));

        });

            for (int i = 0; i < x.length; i++) {
                if (!td.num.contains(i)) {

                    System.out.println(" ---> qualifies = " + i);
                   // throw new IllegalAccessException("does not qualify");
                } else {

                    System.out.println(" this qualifies = " + i);
                }
            }

            //td.isFeedValid();

            //isFeedValid(int [] a)
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
