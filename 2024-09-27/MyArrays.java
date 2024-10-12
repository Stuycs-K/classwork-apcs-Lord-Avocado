public class MyArrays {
  public static void main(String[] args) {
    //first, testing arrayToString
    int[] a1 = new int[] {1, 2, 3, 6, 9};
    // a1 = {1, 2, 3, 6, 91};
    int[] a2 = new int[] {};
    System.out.println(arrayToString(a1));
    System.out.println(arrayToString(a2));
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
}
