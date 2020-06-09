package Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
*  This is an example of using lambdas to implement the compare() of comparator interface
*
* */
public class LambdaExampleComparator {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(30);
        arr.add(35);
        arr.add(5);
        arr.add(0);

        System.out.println("List before sorting : " + arr);

        Comparator<Integer> c = (I1, I2)->(I1<I2)? -1: (I1>I2)?1 : 0;
        Collections.sort(arr,c);
        System.out.println("List after sorting : " + arr);

    }
}
