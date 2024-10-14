public class MyArrays {
  public static void main(String[] args) {
    //first, testing arrayToString
    int[] a1 = new int[] {1, 2, 3, 6, 9};
    // a1 = {1, 2, 3, 6, 91};
    int[] a2 = new int[] {};
    System.out.println(arrayToString(a1));
    System.out.println(arrayToString(a2));

    // testing returnCopy
    int[] b1 = returnCopy(a1);
    System.out.println(arrayToString(b1));
    a1[3] = 7;
    System.out.println(arrayToString(a1));
    System.out.println(arrayToString(b1));

    // finally, testing concatArray
    int[] d1 = new int[] {1, 2, 3, 4, 5};
    int[] d2 = new int[] {1, 4, 9, 16, 25};
    int[] d3 = concatArray(d1, d2);
    System.out.println(arrayToString(d1));
    System.out.println(arrayToString(d2));
    System.out.println(arrayToString(d3));
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
    // returns a copy of the given array
    int[] c1 = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      c1[i] = arr[i];
    }
    return c1;
  }
  public static int[] concatArray(int[]arr1, int[]arr2) {
    //returns a new array containing all values from both arrays given in the same order as given
    int[] arr3 = new int[arr1.length + arr2.length];
    for (int i = 0; i < arr1.length; i++) {
      arr3[i] = arr1[i];
    }
    for (int j = 0; j < arr2.length; j++) {
      arr3[j + arr1.length] = arr2[j];
    }
    return arr3;
  }
}
