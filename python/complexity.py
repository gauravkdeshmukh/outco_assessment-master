 # Problem: Time/Auxillary Space Complexity

 # Given the following two functions, please give the 
 # time and auxillary space complexity required by each. 




# Function: flattenMatrix

# Example Input: 
# var input = [[3,1,4], 
#              [6,4,5], 
#              [3,2,1]];
# first column: 3 + 6 + 3
# second column: 1 + 4 + 2
# third column: 4 + 5 + 1

# Example Output: 
# returns [12, 7, 10]


# FILL OUT HERE:
                  
#            Time Complexity ==> 
# Auxillary Space Complexity ==>

def flattenMatrix(matrix): 
  result = []

  for x in range(len(matrix)): 
    count = 0
    for y in range(len(matrix[0])): 
      count += matrix[y][x]
    result.append(count)

  return result




  # Function: sortAndSearch

  # Example Input: 
  # First parameter (array) = [16,2,41,7,97,0,50,7,71,59,34]
  # Second parameter (target) = 71

  # Example Output: 
  # Boolean = true


  # FILL OUT HERE:
                    
  #            Time Complexity ==> 
  # Auxillary Space Complexity ==>
  

def sortAndSearch(arr, target): 
  arr.sort()
  
  startIndex = 0
  endIndex = len(arr) - 1

  if (target < arr[startIndex] or target > arr[endIndex]): 
    return 'target is not in array'
  elif (target == arr[startIndex]): 
    return startIndex
  elif (target == arr[endIndex]): 
    return endIndex

  while (startIndex < endIndex - 1): 
    midIndex = int((startIndex + endIndex) / 2)

    if (arr[midIndex] == target): 
      return midIndex
    elif (target < arr[midIndex]): 
      endIndex = midIndex
    elif (target > arr[midIndex]): 
      startIndex = midIndex

  return 'target is not in array'









