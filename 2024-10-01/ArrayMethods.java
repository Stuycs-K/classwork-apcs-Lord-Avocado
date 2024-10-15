//Ahana Chandra achandra60@stuy.edu
//Arko Chakrabartiroy achakrabartiroy60@stuy.edu


public class ArrayMethods {
  //same class and initial code from classwork from previous day
  public static void main(String[] args) {
    //first testing arraytoString(int[][])
    int[][] a1 = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println(arrayToString(a1));
    int[][]  a2 = new int[][] {{1, 4, 9, 16}, {1, 8, 27}, {1, 16}, {1, 32, 243, 1024}};
    System.out.println(arrayToString(a2));

    // next, testing arr2DSum
    int[][] b1 = new int[][] {{1, 3, 5, 6, 9}, {3, 71, 69, 10}, {0, 1, 4, -100}}; // should return 82
    System.out.println(arr2DSum(b1));

    // finally, testing swapRC
    int[][] c1 = new int[][] {{1, 2, 3}, {4, 5, 6}};
    System.out.println(arrayToString(swapRC(c1))); // should return {{1, 4}, {2, 5}, {3, 6}}
  }

  public static String arrayToString(int[] nums) {
    if (nums.length == 0) {return "[]";}
    String value = "[";
    for (int i = 0; i < nums.length; i++) {
      value += nums[i];
      if (i != nums.length-1) {
        //i is not the last element in the array
        value += ", ";
      } else {
        //i is the last element in the array
        value += "]";
      }
    }
    return value;
  }

  // arrayToString, but with 2D Array parameter
  public static String arrayToString(int[][] nums) {
    //  use arrayToString(int[])
    String value = "[";
    for (int i = 0; i < nums.length; i++) {
      value += arrayToString(nums[i]);
      if (i != nums.length-1) {
        //i is not the last element in the array
        value += ", ";
      } else {
        //i is the last element in the array
        value += "]";
      }
    }
    return value;
  }


  // returns sum of all values in the 2D array
  public static int arr2DSum(int[][] nums) {
    // use a nested loop
    int value = 0; // thing to return
    for (int i = 0; i < nums.length; i++) {
      // rows
      for (int j = 0; j < nums[i].length; j++) {
        // columns
        value += nums[i][j];
      }
    }
    return value;
  }

  // rotate array by switching rows and cols; you may assume the array is rectangular and neither rows or cols = 0
  public static int[][] swapRC(int[][] nums) {
    //
    int rows = nums.length; // get the number of rows
    int cols = nums[0].length; // get the number of columns; since array is rectangular nums[0].length = nums[1].length...etc
    int[][] value = new int[cols][rows]; // make new array with rows and cols swapped
    for (int i = 0; i < value.length; i++) {
      //for rows of value, aka columns of nums
      for (int j = 0; j < value[i].length; j++) {
        //for columns of value, aka rows of nums
        value[i][j] = nums[j][i];
      }
    }
    return value;
  }
}
