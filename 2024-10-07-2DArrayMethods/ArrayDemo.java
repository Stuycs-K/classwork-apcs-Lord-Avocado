import java.util.Arrays;

public class ArrayDemo{
  //
  public static void main(String[] args) {
    // tests go here
    // now that java.util.Arrays is imported, Arrays.toString(array) can be used
    // Arrays.deepToString(array) for 2D arrays
    int[][] a1 = new int[][] {{1, 2, 3}, {8, 3, 5}, {2, 4, 6, 9}};
    System.out.println(Arrays.deepToString(a1));
    System.out.println(arrayToString(a1));
    System.out.println("\n"); // line break to indicate next test
    int[] b1 = new int[] {5, 23, 62, 17, 3025};
    System.out.println(Arrays.toString(b1));
    System.out.println(arrayToString(b1));
    //
  }

  //arrToString method from before
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

  // 2D arrayToString
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

  // calculate and return the number of elements equal to 0 in the given 2D array
  public static int countZeros2D(int[][] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      // i is rows
      for (int j = 0; j < nums[i].length; j++) {
        // columns
        if (nums[i][j] == 0) {
          count += 1;
        }
      }
    }
    return count;
  }


  // calculate the sum of all values in a 2D array
  public static int arr2DSum(int[][] nums) {
    int total = 0;
    for (int i = 0; i < nums.length; i++) {
      // i is rows
      for (int j = 0; j < nums[i].length; j++) {
        // j is columns in a given row
        total += nums[i][j];
      }
    }
    return total;
  }
}
