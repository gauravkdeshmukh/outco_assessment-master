/**
 *
 * Problem: Time/Auxillary Space Complexity
 *
 * Given the following two functions, please give the 
 * time and auxillary space complexity required by each. 
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;

public class complexity {
    public static void main(String args[]) {
        FlatMat prob1 = new FlatMat();
        prob1.flattenMatrix();

        SortAndSea prob2 = new SortAndSea();
        prob2.sortAndSearch();
    }
}

/**
 *
 * Function: flattenMatrix
 *
 * Example Input: 
 * var input = [[3,1,4], 
 *              [6,4,5], 
 *              [3,2,1]];
 * first column: 3 + 6 + 3
 * second column: 1 + 4 + 2
 * third column: 4 + 5 + 1
 *
 * Example Output: 
 * returns [12, 7, 10]
 *
 * 
 * FILL OUT HERE:
 *                   
 *            Time Complexity ==> O(xy) ==> O(n^2) , taking x==y 
 * Auxillary Space Complexity ==> O(n) ,  space is created to store results , which could max upto n
 * 
 */

class FlatMat {
  public void flattenMatrix(){

    ArrayList<Integer> results = new ArrayList<Integer>();

    int[][] matrix = {{3,1,4},{6,4,5},{3,2,1}};  

    for (int x = 0; x < matrix.length; x++){  // runs x times
      int count = 0;
      for (int y = 0; y < matrix[x].length; y++){ // runs y times
        count += matrix[y][x];
      }
      results.add(count);
    }

    System.out.println("fattenMatrix output: " + results);
  }
}

/**
 *
 * Function: sortAndSearch
 *
 * Example Input: 
 * First parameter (array) = [16,2,41,7,97,0,50,7,71,59,34]
 * Second parameter (target) = 71
 *
 * Example Output: 
 * Boolean = true
 *
 *
 * FILL OUT HERE:
 *                   
 *            Time Complexity ==> O(nlogn) , array is divided into parts
 * Auxillary Space Complexity ==> O(1)
 * 
 */

class SortAndSea {
  public void sortAndSearch(){

    int target = 85;
    int[] arr = {1,23,7,99,13,6,92,2,8,4,21,246,71,85,27,5,26,364,9,74,34,47};
    Arrays.sort(arr);

    int startIndex = 0;
    int endIndex = arr.length-1;
    int midIndex;

    if (target < arr[startIndex] || target > arr[endIndex]){
      System.out.println(Arrays.toString(arr));
      System.out.println("SOS output: target is not in array");
      return;
    } else if (target == arr[startIndex]){
      System.out.println("SOS output: " + startIndex);
      return;
    } else if (target == arr[endIndex]){
      System.out.println("SOS output: " + endIndex);
      return;
    }

    while (startIndex < endIndex - 1){
      midIndex = (startIndex + endIndex) / 2;

      if (arr[midIndex] == target){
        System.out.println("SOS output: " + midIndex);
        return;
      } else if (target < arr[midIndex]){
        endIndex = midIndex;
      } else if (target > arr[midIndex]){
        startIndex = midIndex;
      }
    }

    System.out.println("SOS output: target is not in array");

  }
}




