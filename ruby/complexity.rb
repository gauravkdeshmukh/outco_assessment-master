

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

def flattenMatrix(matrix)
  result = []

  for x in 0..matrix.size-1
    count = 0
    for y in 0..matrix[0].size-1
      count += matrix[y][x]
    end
    result.push(count)
  end

  return result
end



 # Function: sortAndSearch

 # Example Input: 
 # First parameter (array) = [16,2,41,7,97,0,50,7,71,59,34]
 # Second parameter (target) = 71

 # Example Output: 
 # Boolean = true


 # FILL OUT HERE:
                   
 #            Time Complexity ==> 
 # Auxillary Space Complexity ==>
 
def sortAndSearch(arr, target)
  arr = arr.sort_by(&:to_i)

  startIndex = 0;
  endIndex = arr.size-1

  if (target < arr[startIndex] || target > arr[endIndex])
    return 'target is not in array'
  elsif (target === arr[startIndex])
    return startIndex
  elsif (target === arr[endIndex])
    return endIndex
  end

  while (startIndex < endIndex - 1)
    midIndex = (startIndex + endIndex) / 2

    if (arr[midIndex] === target)
      return midIndex
    elsif (target < arr[midIndex])
      endIndex = midIndex
    elsif (target > arr[midIndex])
      startIndex = midIndex
    end
  end

  return 'target is not in array'
end


