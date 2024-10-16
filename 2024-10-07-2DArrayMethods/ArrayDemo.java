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
    System.out.println("\n");
    int[][] c1 = new int[][] {{0, 1, 2, 3, 4, 5, 6, 7, 8}, {1, 0}, {0}, {3}, {}};
    System.out.println(Arrays.deepToString(c1));
    int c2 = countZeros2D(c1);
    System.out.println(c2); // should print 3
    System.out.println("\n");
    // testing arr2DSum
    System.out.println(arr2DSum(c1)); // should print 40
    // System.out.println(Arrays.deepToString(c1));
    System.out.println("\n");
    int[][] d1 = new int[][] {{0, -1, -3, -4}, {-6, -7, -12, -100}, {1, 3, -1}, {}};
    System.out.println(Arrays.deepToString(d1));
    replaceNegative(d1);
    System.out.println(Arrays.deepToString(d1));
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

  // replace negatives where row = column with 1, else with 0
  public static void replaceNegative(int[][] nums) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        if (nums[i][j] < 0) {
          if (i == j) {
            nums[i][j] = 1;
          } else {
            nums[i][j] = 0;
          }
        }
      }
    }
    // nothing to return because this function is void
  }
}
