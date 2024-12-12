import java.util.ArrayList;

public class Driver {
  // 
  public static void main(String[] args) {
    // 1. create 80x80 border of color (can be multiple, including foreground and background) around the screen. Should be 1 character thick.
    // 2. make an array of 3 random integers from 0-99 inclusive
    // 3. display the three integers made, evenly spaced (approximately), on the row below the top border.
    // 4. depending on the values of the integers, print them in the following colors:
    // <25 = bright red, >75 = bright green, otherwise default to white (assuming terminal color is black).
    // 5. On the line below the random numbers, draw a horizontal seperator (can match border color but use a different character).
    // 6. (DO THIS AFTER EVERYTHING ELSE) move cursor to line 31 before program exits; otherwise, your terminal will draw over your screen.
    // 7. Extra: draw something in the middle of your screen (before you move your cursor to the end).
    // 
  }
  public static void createBorder(int x, int y, String fcolor, String bcolor, int thickness) {
    // 
  }
  public static ArrayList<Integer> generateArray(int length, int range, int shift) {
    // first make a new ArrayList<Integer>
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for (int i = 0; i < length; i++) {
      // 
      int rand = new Integer(Math.random() * range + shift);
      arr.add(rand);
    }
    return arr;
  }
  public static void drawHorizontal(char a, String fcolor, String bcolor) {
    // 
  }
  public static void endProgram() {
    // 
  }
}
