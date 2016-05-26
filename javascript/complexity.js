/**
 *
 * Problem: Time/Auxillary Space Complexity
 *
 * Given the following two functions, please give the 
 * time and auxillary space complexity required by each. 
 * 
 */




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
 *            Time Complexity ==> 
 * Auxillary Space Complexity ==>
 * 
 */

var flattenMatrix = function(matrix){
  var result = [];

  for (var x = 0; x < matrix.length; x++){
    var count = 0;
    for (var y = 0; y < matrix[x].length; y++){
      count += matrix[y][x];
    }
    result.push(count);
  }

  return result;
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
 *            Time Complexity ==> 
 * Auxillary Space Complexity ==>
 * 
 */

 var sortAndSearch = function(arr, target){
   arr = arr.sort(function(a, b){return a-b});

   var startIndex = 0;
   var endIndex = arr.length-1;
   var midIndex;

   if (target < arr[startIndex] || target > arr[endIndex]){
     return "target is not in array";
   } else if (target === arr[startIndex]){
     return startIndex;
   } else if (target === arr[endIndex]){
     return endIndex;
   }

   while (startIndex < endIndex - 1){

     midIndex = Math.floor((startIndex + endIndex) / 2);

     if (arr[midIndex] === target){
       return midIndex;
     } else if (target < arr[midIndex]){
       endIndex = midIndex;
     } else if (target > arr[midIndex]){
       startIndex = midIndex;
     }
     
   }

   return "target is not in array";
 }




