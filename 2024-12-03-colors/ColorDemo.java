public class ColorDemo {
  public static void main(String[] args) {
    //
    String CLEAR_SCREEN =  "\u001b[2J";
    String HIDE_CURSOR =  "\u001b[?25l";
    String SHOW_CURSOR =  "\u001b[?25h";
    // colors
    String BLACK = "\u001b[30m";
    String RED = "\u001b[31m";
    String GREEN = "\u001b[32m";
    String YELLOW = "\u001b[33m";
    String BLUE = "\u001b[34m";
    String MAGENTA = "\u001b[35m";
    String CYAN = "\u001b[36m";
    String WHITE = "\u001b[37m";
    String RESET = "\u001b[0m";
    // tests
    System.out.println("Regular text!");
    System.out.print(BLACK);
    System.out.println("Black text!");
    System.out.print(RED);
    System.out.print("Red text!");
    System.out.println(GREEN + "Green text!");
    System.out.println(YELLOW + "Yellow text!");
    System.out.println(BLUE + "Blue text!");
    System.out.println(MAGENTA + "Magenta text!");
    System.out.println(CYAN + "Cyan text!");
    System.out.println(WHITE + "White text!");



  }
  public static void color(int foreground,int background){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
  }
  public static void go(int r,int c){
    System.out.print("\u001b[" + r + ";" + c + "f");
  }
  public static void sleep(int milli){
      try{
        Thread.sleep(milli);
      } catch(Exception e){
        // 
      }
    }
}
