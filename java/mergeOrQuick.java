/**
 *
 * Problem: Mergesort or Quicksort
 *
 * In this problem, implement either mergesort or quicksort
 *
 * For your help, we have supplied a million-element array of
 * unsorted numbers that your sorting algorithm should be 
 * able to sort. 
 *
 * REMINDER: ONLY DO EITHER MERGESORT OR QUICKSORT, NOT BOTH
 */

// test is an array of a million unsorted elements
// run your algorithm on test

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class mergeOrQuick {
  public static void main(String args[]) {
    int i = 1000000;
    List<Double> test = new ArrayList<>(Arrays.asList(1.38, 2.56, 4.3));

    Random rand;
    while (i > 0){
       test.add(Math.floor(Math.random() * 100000));
       i--;
    }

    System.out.println(test);

    MergeSort prob1 = new MergeSort();
    prob1.mergeSort(test);

    QuickSort prob2 = new QuickSort();
    prob2.quickSort(test);

  }
}

class MergeSort {
  public mergeSort(n){
    // your work here
  }
}

class QuickSort {
  public quickSort(n){
    // your work here
  }
}





