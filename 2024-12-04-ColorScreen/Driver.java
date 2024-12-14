import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
  //
  public static void main(String[] args) {
    // 1. create 80x30 border of color (can be multiple, including foreground and background) around the screen. Should be 1 character thick.
    // 2. make an array of 3 random integers from 0-99 inclusive
    // 3. display the three integers made, evenly spaced (approximately), on the row below the top border.
    // 4. depending on the values of the integers, print them in the following colors:
    // <25 = bright red, >75 = bright green, otherwise default to white (assuming terminal color is black).
    // 5. On the line below the random numbers, draw a horizontal seperator (can match border color but use a different character).
    // 6. (DO THIS AFTER EVERYTHING ELSE) move cursor to line 31 before program exits; otherwise, your terminal will draw over your screen.
    // 7. Extra: draw something in the middle of your screen (before you move your cursor to the end).
    //
    System.out.println("Hello World!"); // test
    ArrayList<Integer> a1 = generateArray(3, 99, 0);
    System.out.println(a1);
    createBorder(30, 80, 31, 32); // note: this does not fill the full screen on my home laptop, not sure if it will on the lab computers since they are bigger
    //
    System.out.println();
    Text.go(2, 2);
    boolean isBright1 = false;
    boolean isBright2 = false;
    boolean isBright3 = false;
    int b1;
    int b2;
    int b3;
    if ((int) a1.get(0) < 25) {
      b1 = Text.RED;
      isBright1 = true;
    } else if ((int) a1.get(0) > 75) {
      b1 = Text.GREEN;
      isBright1 = true;
      isBright1 = true;
    } else {
      b1 = Text.WHITE;
    }
    // System.out.println(b1);
    if ((int) a1.get(1) < 25) {
      b2 = Text.RED;
      isBright2 = true;
    } else if ((int) a1.get(1) > 75) {
      b2 = Text.GREEN;
      isBright2 = true;
    } else {
      b2 = Text.WHITE;
    }
    // System.out.println(b2);
    if ((int) a1.get(2) < 25) {
      b3 = Text.RED;
      isBright3 = true;
    } else if ((int) a1.get(2) > 75) {
      b3 = Text.GREEN;
      isBright3 = true;
    } else {
      b3 = Text.WHITE;
    }
    // System.out.println(b3);
    if (isBright1) {
      Text.color(b1, Text.BRIGHT);
    } else {
      Text.color(b1);
    }
    System.out.print(a1.get(0) + "                                   ");
    if (isBright2) {
      Text.color(b2, Text.BRIGHT);
    } else {
      Text.color(b2);
    }
    System.out.print(a1.get(1) + "                                   ");
    if (isBright3) {
      Text.color(b3, Text.BRIGHT);
    } else {
      Text.color(b3);
    }
    System.out.print(a1.get(2));
    // at end of program go back to end
    // Text.go(31, 81);
    // Text.color(Text.YELLOW);
    Text.go(3, 2); // y, x
    drawHorizontal('-', Text.YELLOW, 0);
    // Text.sleep(5000);
    // at the end of the program go back to the end
    Text.go(31, 81);
    System.out.println(Text.RESET);
    System.out.println("Done!");
  }
  public static void createBorder(int x, int y, int fcolor, int bcolor) {
    //
    System.out.print(Text.CLEAR_SCREEN);
    System.out.print(Text.HIDE_CURSOR);
    for (int i = 0; i < x; i++) {
      //
      for (int j = 0; j < y; j++) {
        //
        if (i == 0 || j == 0 || i == x-1 || j == y-1) {
          // draw border stuff
          Text.go(i, j);
          Text.color(fcolor, bcolor+10);
          System.out.print("x");
        }
      }
    }
    // reset
    System.out.print(Text.RESET);
  }
  public static ArrayList<Integer> generateArray(int length, int range, int shift) {
    // first make a new ArrayList<Integer>
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for (int i = 0; i < length; i++) {
      //
      int rand = (int) (Math.random() * range + shift);
      arr.add(rand);
    }
    return arr;
  }
  public static void drawHorizontal(char a, int fcolor, int bcolor) {
    //
    if (bcolor == 0) {
      // "0" means no background color
      Text.color(fcolor);
    } else {
      Text.color(fcolor, bcolor+10);
    }
    String horizontal = "";
    for (int i = 0; i < 77; i++) {
      horizontal += a;
    }
    System.out.println(horizontal);
    System.out.println(Text.RESET); // to reset the color
  }
  public static void endProgram() {
    //
  }
}
