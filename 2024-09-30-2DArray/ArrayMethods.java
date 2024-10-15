//Ahana Chandra achandra60@stuy.edu
//Arko Chakrabartiroy achakrabartiroy60@stuy.edu


public class ArrayMethods {
  //
  public static void main(String[] args) {
    //first testing arraytoString(int[][])
    int[][] a1 = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println(arrayToString(a1));
    int[][]  a2 = new int[][] {{1, 4, 9, 16}, {1, 8, 27}, {1, 16}, {1, 32, 243, 1024}};
    System.out.println(arrayToString(a2));

    // next, testing arr2DSum
    int[][] b1 = new int[][] {{1, 3, 5, 6, 9}, {3, 71, 69, 10}, {0, 1, 4, -100}}; // should return 82
    System.out.println(arr2DSum(b1));
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
}
