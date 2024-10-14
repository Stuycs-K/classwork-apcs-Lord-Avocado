public class MyArrays {
  public static void main(String[] args) {
    //first, testing arrayToString
    int[] a1 = new int[] {1, 2, 3, 6, 9};
    // a1 = {1, 2, 3, 6, 91};
    int[] a2 = new int[] {};
    System.out.println(arrayToString(a1));
    System.out.println(arrayToString(a2));
    int[] b1 = returnCopy(a1);
    System.out.println(arrayToString(b1));
    a1[3] = 7;
    System.out.println(arrayToString(a1));
    System.out.println(arrayToString(b1));
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

  public static int[] returnCopy(int[] arr) {
    //
    int[] c1 = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      c1[i] = arr[i];
    }
    return c1;
  }
  public static int[] concatArray(int[]arr1, int[]arr2) {
    //
    return null;
  }
}
