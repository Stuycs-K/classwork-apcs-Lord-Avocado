//Ahana Chandra achandra60@stuy.edu
//Arko Chakrabartiroy achakrabartiroy60@stuy.edu


public class ArrayMethods {
  //


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
